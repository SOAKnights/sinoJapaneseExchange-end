package org.csu.sinojapaneseexchange.service;


import org.csu.sinojapaneseexchange.domain.WordInfo;
import org.csu.sinojapaneseexchange.domain.WordInfoExample;
import org.csu.sinojapaneseexchange.persistence.WordInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WordInfoService {

    @Autowired
    WordInfoMapper wordInfoMapper;

    public WordInfo getWordInfoById(int id)
    {
        return wordInfoMapper.selectByPrimaryKey(id);
    }

    public List<WordInfo> getWordInfosByFragment(int fragment)
    {
        WordInfoExample wordInfoExample = new WordInfoExample();
        WordInfoExample.Criteria criteria = wordInfoExample.createCriteria();
        criteria.andFragmentEqualTo(fragment);
        List<WordInfo> wordInfos = wordInfoMapper.selectByExample(wordInfoExample);
        return wordInfos;
    }


}
