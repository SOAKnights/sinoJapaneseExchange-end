package org.csu.sinojapaneseexchange.controller;


import io.swagger.annotations.ApiOperation;
import org.csu.sinojapaneseexchange.domain.WordInfo;
import org.csu.sinojapaneseexchange.interaction.Result;
import org.csu.sinojapaneseexchange.interaction.ResultGenerator;
import org.csu.sinojapaneseexchange.interaction.Util;
import org.csu.sinojapaneseexchange.interaction.WordInfoUp;
import org.csu.sinojapaneseexchange.service.WordInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class DBController {

    @Autowired
    WordInfoService wordInfoService;

    @GetMapping("/DB/words")
    @ApiOperation("根据id返回单词")
    public Result getNext(@RequestParam("id") int id){
        try{

            WordInfo wordInfo = wordInfoService.getWordInfoById(id);
            WordInfoUp wordInfoUp = new WordInfoUp();
            Util.wordInfoToWordInfoUp(wordInfo, wordInfoUp);

            return ResultGenerator.success(wordInfoUp);
        } catch (Exception e)
        {
            return ResultGenerator.fail(e.getMessage());
        }
    }


    @GetMapping("/DB/fragments")
    @ApiOperation("根据fragment返回单词")
    public Result getFragment(@RequestParam("fragment") int fragment){
        try{

            List<WordInfo> wordInfos = wordInfoService.getWordInfosByFragment(fragment);
            List<WordInfoUp> wordInfoUps = new ArrayList<>();

            for (WordInfo wordinfo :
                    wordInfos) {
                WordInfoUp wordInfoUp = new WordInfoUp();
                Util.wordInfoToWordInfoUp(wordinfo, wordInfoUp);
                wordInfoUps.add(wordInfoUp);
            }

            return ResultGenerator.success(wordInfoUps);

        } catch (Exception e)
        {
            return ResultGenerator.fail(e.getMessage());
        }
    }
}
