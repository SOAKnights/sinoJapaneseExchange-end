package org.csu.sinojapaneseexchange.controller;


import io.swagger.annotations.ApiOperation;
import org.csu.sinojapaneseexchange.domain.WordInfo;
import org.csu.sinojapaneseexchange.interaction.Result;
import org.csu.sinojapaneseexchange.interaction.ResultGenerator;
import org.csu.sinojapaneseexchange.ocr.OCR;
import org.csu.sinojapaneseexchange.service.WordInfoService;
import org.csu.sinojapaneseexchange.translate.Translator;
import org.csu.sinojapaneseexchange.tts.TTSUtil;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ApiController {

    TTSUtil ttsUtil = new TTSUtil();
    private final String CHINESE = "Microsoft Server Speech Text to Speech Voice (zh-CN, Yaoyao, Apollo)";
    private final String JAPANESE = "Microsoft Server Speech Text to Speech Voice (ja-JP, Ayumi, Apollo)";

    @Autowired
    WordInfoService wordInfoService;


    @GetMapping("/api/voice/japanese")
    @ApiOperation("日文发音")
    public @ResponseBody void japaneseVoice(@RequestParam("text") String text, HttpServletResponse httpServletResponse){

        try{
            ByteArrayInputStream in = new ByteArrayInputStream(ttsUtil.tts(text, JAPANESE));
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


    @GetMapping("/api/voice/chinese")
    @ApiOperation("中文发音")
    public @ResponseBody void chineseVoice(@RequestParam("text") String text, HttpServletResponse httpServletResponse){
        try{
            ByteArrayInputStream in = new ByteArrayInputStream(ttsUtil.tts(text, CHINESE));
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


    @GetMapping("/ocr")
    @ApiOperation("图像识别")
    public Result ocr(@RequestParam("imgPath") String imgPath)
    {
        List<String> res = null;
        try {
            res =  OCR.getOCRResult(imgPath);

            return  ResultGenerator.success(res);
        } catch (JSONException e) {
            e.printStackTrace();
            return ResultGenerator.fail(null);
        }
    }

}
