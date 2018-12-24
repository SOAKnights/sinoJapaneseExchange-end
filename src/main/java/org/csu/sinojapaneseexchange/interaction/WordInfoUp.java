package org.csu.sinojapaneseexchange.interaction;

import java.util.List;

public class WordInfoUp {

    private Integer id;

    private Integer fragment;

    private String wordZh;

    private String wordJa;

    private String roma;

    private List<Sentence> sentences;

    private String imgurl;

    public WordInfoUp() {
    }

    public WordInfoUp(Integer id, Integer fragment, String wordZh, String wordJa, String roma, List<Sentence> sentences, String imgurl) {
        this.id = id;
        this.fragment = fragment;
        this.wordZh = wordZh;
        this.wordJa = wordJa;
        this.roma = roma;
        this.sentences = sentences;
        this.imgurl = imgurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFragment() {
        return fragment;
    }

    public void setFragment(Integer fragment) {
        this.fragment = fragment;
    }

    public String getWordZh() {
        return wordZh;
    }

    public void setWordZh(String wordZh) {
        this.wordZh = wordZh;
    }

    public String getWordJa() {
        return wordJa;
    }

    public void setWordJa(String wordJa) {
        this.wordJa = wordJa;
    }

    public String getRoma() {
        return roma;
    }

    public void setRoma(String roma) {
        this.roma = roma;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
