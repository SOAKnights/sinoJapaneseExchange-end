//
// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license.
//
// Microsoft Cognitive Services (formerly Project Oxford): https://www.microsoft.com/cognitive-services
//
// Microsoft Cognitive Services (formerly Project Oxford) GitHub:
// https://github.com/Microsoft/Cognitive-Speech-TTS
//
// Copyright (c) Microsoft Corporation
// All rights reserved.
//
// MIT License:
// Permission is hereby granted, free of charge, to any person obtaining
// a copy of this software and associated documentation files (the
// "Software"), to deal in the Software without restriction, including
// without limitation the rights to use, copy, modify, merge, publish,
// distribute, sublicense, and/or sell copies of the Software, and to
// permit persons to whom the Software is furnished to do so, subject to
// the following conditions:
//
// The above copyright notice and this permission notice shall be
// included in all copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED ""AS IS"", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
// LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
// OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
// WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//

package org.csu.sinojapaneseexchange.tts;

import javax.sound.sampled.*;
import java.io.File;
import java.io.FileOutputStream;

public class TTSUtil {

    // 密钥
    private Authentication auth = new Authentication("946b0d0df66048139b98cf59fb42564b");
    static String outputFormat = AudioOutputFormat.Riff24Khz16BitMonoPcm;
    static String deviceLanguage = "en-US";
    static String genderName = Gender.Female;
//    String voiceName = "Microsoft Server Speech Text to Speech Voice (ja-JP, Ayumi, Apollo)";


	public static byte[] tts(String textToSynthesize, String voiceName, Authentication auth) {

        try{

        	byte[] audioBuffer = TTSService.Synthesize(auth, textToSynthesize, outputFormat, deviceLanguage, genderName, voiceName);
//            for (byte o :
//                    audioBuffer) {
//                System.out.print(o);
//            }
//
//        	// write the pcm data to the file
//        	String outputWave = ".\\output.pcm";
//        	File outputAudio = new File(outputWave);
//        	FileOutputStream fstream = new FileOutputStream(outputAudio);
//            fstream.write(audioBuffer);
//            fstream.flush();
//            fstream.close();
//
//            // specify the audio format
//           	AudioFormat audioFormat = new AudioFormat(
//           			AudioFormat.Encoding.PCM_SIGNED,
//               		24000,
//               		16,
//               		1,
//               		1 * 2,
//               		24000,
//               		false);
//
//               AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(outputWave));
//
//               DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class,
//                       audioFormat, AudioSystem.NOT_SPECIFIED);
//               SourceDataLine sourceDataLine = (SourceDataLine) AudioSystem
//                       .getLine(dataLineInfo);
//               sourceDataLine.open(audioFormat);
//               sourceDataLine.start();
//               System.out.println("start to play the wave:");
//               /*
//                * read the audio data and send to mixer
//                */
//               int count;
//               byte tempBuffer[] = new byte[4096];
//               while ((count = audioInputStream.read(tempBuffer, 0, tempBuffer.length)) >0) {
//                       sourceDataLine.write(tempBuffer, 0, count);
//               }
//
//               sourceDataLine.drain();
//               sourceDataLine.close();
//               audioInputStream.close();
            return audioBuffer;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
   }

}
