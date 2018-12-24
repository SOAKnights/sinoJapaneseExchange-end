package org.csu.sinojapaneseexchange.interaction;

import org.csu.sinojapaneseexchange.domain.WordInfo;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static void wordInfoToWordInfoUp(WordInfo wordInfo, WordInfoUp wordInfoUp)
    {
        wordInfoUp.setFragment(wordInfo.getFragment());
        wordInfoUp.setId(wordInfo.getId());
        wordInfoUp.setImgurl(wordInfo.getImgurl());
        wordInfoUp.setRoma(wordInfo.getRoma());
        wordInfoUp.setWordJa(wordInfo.getWordJa());
        wordInfoUp.setWordZh(wordInfo.getWordZh());

        List<Sentence> sentences = new ArrayList<>();
        sentences.add(new Sentence(wordInfo.getSenZh1(), wordInfo.getSenJa1()));
        sentences.add(new Sentence(wordInfo.getSenZh2(), wordInfo.getSenJa2()));
        sentences.add(new Sentence(wordInfo.getSenZh3(), wordInfo.getSenJa3()));

        wordInfoUp.setSentences(sentences);
    }

}
