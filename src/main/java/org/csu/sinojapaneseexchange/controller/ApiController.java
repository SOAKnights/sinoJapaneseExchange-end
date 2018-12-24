package org.csu.sinojapaneseexchange.controller;


import io.swagger.annotations.ApiOperation;
import org.csu.sinojapaneseexchange.domain.WordInfo;
import org.csu.sinojapaneseexchange.interaction.Result;
import org.csu.sinojapaneseexchange.interaction.ResultGenerator;
import org.csu.sinojapaneseexchange.service.WordInfoService;
import org.csu.sinojapaneseexchange.translate.Translator;
import org.csu.sinojapaneseexchange.tts.TTSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin
public class ApiController {

    TTSUtil ttsUtil = new TTSUtil();
    private final String CHINESE = "Microsoft Server Speech Text to Speech Voice (zh-CN, Yaoyao, Apollo)";
    private final String JAPANESE = "Microsoft Server Speech Text to Speech Voice (ja-JP, Ayumi, Apollo)";

    @Autowired
    WordInfoService wordInfoService;

    // 应该改为流
    @GetMapping("/api/voice/japanese")
    @ApiOperation("日文发音")
    public void voice(@RequestParam("text") String text){
        ttsUtil.tts(text, JAPANESE);
    }


    @GetMapping("/api/voice/chinese")
    @ApiOperation("中文发音")
    public void voice2(@RequestParam("text") String text){
        ttsUtil.tts(text, CHINESE);
    }


    @GetMapping("/api/words")
    @ApiOperation("根据id返回单词")
    public Result getNext(@RequestParam("id") int id){
        try{
            return ResultGenerator.success(wordInfoService.getWordInfoById(id));
        } catch (Exception e)
        {
            return ResultGenerator.fail(e.getMessage());
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

}
