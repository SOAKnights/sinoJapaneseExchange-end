package org.csu.sinojapaneseexchange.controller;


import io.swagger.annotations.ApiOperation;
import org.csu.sinojapaneseexchange.domain.WordInfo;
import org.csu.sinojapaneseexchange.interaction.Result;
import org.csu.sinojapaneseexchange.interaction.ResultGenerator;
import org.csu.sinojapaneseexchange.ocr.OCR;
import org.csu.sinojapaneseexchange.service.WordInfoService;
import org.csu.sinojapaneseexchange.stt.SpeechClientREST;
import org.csu.sinojapaneseexchange.translate.Translator;
import org.csu.sinojapaneseexchange.tts.Authentication;
import org.csu.sinojapaneseexchange.tts.TTSUtil;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ApiController {

    Authentication auth = new Authentication("946b0d0df66048139b98cf59fb42564b");
    SpeechClientREST speechClientREST = new SpeechClientREST(auth);


    private final String CHINESE = "Microsoft Server Speech Text to Speech Voice (zh-CN, Yaoyao, Apollo)";
    private final String JAPANESE = "Microsoft Server Speech Text to Speech Voice (ja-JP, Ayumi, Apollo)";

    @Autowired
    WordInfoService wordInfoService;


    @GetMapping("/api/voice/japanese")
    @ApiOperation("日文发音")
    public @ResponseBody void japaneseVoice(@RequestParam("text") String text, HttpServletResponse httpServletResponse){

        try{
            byte[] audioBytes = TTSUtil.tts(text, JAPANESE, auth);

            ByteArrayInputStream in = new ByteArrayInputStream(audioBytes);
            ServletOutputStream out = httpServletResponse.getOutputStream();
            byte[] b = null;
            while(in.available() >0) {
                if(in.available()>10240) {
                    b = new byte[10240];
                }else {
                    b = new byte[in.available()];
                }
                in.read(b, 0, b.length);
                out.write(b, 0, b.length);
            }
            in.close();
            out.flush();
            out.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }

//    @GetMapping("/api/voice/japanese")
//    @ApiOperation("日文发音")
//    public Result japaneseVoice(@RequestParam("text") String text){
//
//        try{
//            byte[] audioBytes = ttsUtil.tts(text, JAPANESE);
//
//            InputStream inputStream = new ByteArrayInputStream(audioBytes);
//            OutputStream outputStream = new FileOutputStream("a.mp3");
//            byte[] buff = new byte[1024];
//            int len;
//            while ((len = inputStream.read(buff)) != -1)
//            {
//                outputStream.write(buff,0,len);
//            }
//            inputStream.close();
//            outputStream.flush();
//            outputStream.close();
//
//            File file = new File("a.mp3");
//            return ResultGenerator.success(file);
//
//        } catch (Exception e)
//        {
//            e.printStackTrace();
//            return null;
//        }
//    }

    @GetMapping("/api/voice/chinese")
    @ApiOperation("中文发音")
    public @ResponseBody void chineseVoice(@RequestParam("text") String text, HttpServletResponse httpServletResponse){
        try{
            ByteArrayInputStream in = new ByteArrayInputStream(TTSUtil.tts(text, CHINESE,auth));
            ServletOutputStream out = httpServletResponse.getOutputStream();
            byte[] b = null;
            while(in.available() >0) {
                if(in.available()>10240) {
                    b = new byte[10240];
                }else {
                    b = new byte[in.available()];
                }
                in.read(b, 0, b.length);
                out.write(b, 0, b.length);
            }
            in.close();
            out.flush();
            out.close();

        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    @GetMapping("/api/zhToJa")
    @ApiOperation("中译日")
    public Result zhToJa(@RequestParam("text") String text)
    {
        try {
            Map<String,String> ja = Translator.TranslateGoogleGet(text,"zh-CN","ja");

            WordInfo wordInfo = new WordInfo();
            wordInfo.setWordZh(text);
            wordInfo.setWordJa(ja.get("result"));
            wordInfo.setRoma(ja.get("roma"));

            return ResultGenerator.success(wordInfo);

        }catch (Exception e)
        {
            return ResultGenerator.fail(e.getMessage());
        }

    }


    @GetMapping("/api/jaToZh")
    @ApiOperation("日译中")
    public Result jaToZh(@RequestParam("text") String text)
    {
        try {

            Map<String,String> ja = Translator.TranslateGoogleGet(text,"ja","zh-CN");

            WordInfo wordInfo = new WordInfo();
            wordInfo.setWordZh(text);
            wordInfo.setRoma(ja.get("roma"));
            wordInfo.setWordJa(ja.get("result"));

            return ResultGenerator.success(wordInfo);

        } catch (Exception e)
        {
            return ResultGenerator.fail(e.getMessage());
        }
    }


    @PostMapping("/ocr")
    @ApiOperation("图像识别")
    public Result ocr(MultipartFile imgFile)
    {
        List<String> res = null;
        try {
            res =  OCR.getOCRResult(imgFile);

            return  ResultGenerator.success(res);
        } catch (JSONException e) {
            e.printStackTrace();
            return ResultGenerator.fail(null);
        }
    }


    @PostMapping("/stt")
    @ApiOperation("语音转文字")
    public Result stt(MultipartFile voiceFile)
    {
        try {
            InputStream input = voiceFile.getInputStream();
            String result = speechClientREST.process(input);

            if ("Success".equals(result.substring(22,29)))
                return ResultGenerator.success(result.substring(result.indexOf("DisplayText") + 14, result.indexOf("\",\"Offset")));
            else
                return ResultGenerator.fail("识别失败");

        }catch (Exception e)
        {
            e.printStackTrace();
            return ResultGenerator.fail("识别失败");
        }
    }

//    @PostMapping("/stt")
//    @ApiOperation("语音转文字")
//    public Result stt(@RequestParam("path") String path)
//    {
//        try {
//            InputStream input = new FileInputStream(Paths.get(path).toFile());
//            String result = speechClientREST.process(input);
//
//            if ("Success".equals(result.substring(22,29)))
//                return ResultGenerator.success(result.substring(result.indexOf("DisplayText") + 14, result.indexOf("\",\"Offset")));
//            else
//                return ResultGenerator.fail("识别失败");
//
//        }catch (Exception e)
//        {
//            e.printStackTrace();
//            return ResultGenerator.fail("识别失败");
//        }
//    }


}
