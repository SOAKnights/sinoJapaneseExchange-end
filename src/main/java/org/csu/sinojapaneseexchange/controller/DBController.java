package org.csu.sinojapaneseexchange.controller;


import io.swagger.annotations.ApiOperation;
import org.csu.sinojapaneseexchange.interaction.Result;
import org.csu.sinojapaneseexchange.interaction.ResultGenerator;
import org.csu.sinojapaneseexchange.service.WordInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class DBController {

    @Autowired
    WordInfoService wordInfoService;

    @GetMapping("/DB/words")
    @ApiOperation("根据id返回单词")
    public Result getNext(@RequestParam("id") int id){
        try{
            return ResultGenerator.success(wordInfoService.getWordInfoById(id));
        } catch (Exception e)
        {
            return ResultGenerator.fail(e.getMessage());
        }
    }


    @GetMapping("/DB/fragments")
    @ApiOperation("根据fragment返回单词")
    public Result getFragment(@RequestParam("fragment") int fragment){
        try{
            return ResultGenerator.success(wordInfoService.getWordInfoById(fragment));

        } catch (Exception e)
        {
            return ResultGenerator.fail(e.getMessage());
        }
    }
}
