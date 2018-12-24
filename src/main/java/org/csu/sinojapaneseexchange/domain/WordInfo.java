package org.csu.sinojapaneseexchange.domain;

public class WordInfo {
    private Integer id;

    private Integer fragment;

    private String wordZh;

    private String wordJa;

    private String roma;

    private String senZh1;

    private String senJa1;

    private String senZh2;

    private String senJa2;

    private String senZh3;

    private String senJa3;

    private String imgurl;

    public WordInfo(Integer id, Integer fragment, String wordZh, String wordJa, String roma, String senZh1, String senJa1, String senZh2, String senJa2, String senZh3, String senJa3, String imgurl) {
        this.id = id;
        this.fragment = fragment;
        this.wordZh = wordZh;
        this.wordJa = wordJa;
        this.roma = roma;
        this.senZh1 = senZh1;
        this.senJa1 = senJa1;
        this.senZh2 = senZh2;
        this.senJa2 = senJa2;
        this.senZh3 = senZh3;
        this.senJa3 = senJa3;
        this.imgurl = imgurl;
    }

    public WordInfo() {
        super();
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
        this.wordZh = wordZh == null ? null : wordZh.trim();
    }

    public String getWordJa() {
        return wordJa;
    }

    public void setWordJa(String wordJa) {
        this.wordJa = wordJa == null ? null : wordJa.trim();
    }

    public String getRoma() {
        return roma;
    }

    public void setRoma(String roma) {
        this.roma = roma == null ? null : roma.trim();
    }

    public String getSenZh1() {
        return senZh1;
    }

    public void setSenZh1(String senZh1) {
        this.senZh1 = senZh1 == null ? null : senZh1.trim();
    }

    public String getSenJa1() {
        return senJa1;
    }

    public void setSenJa1(String senJa1) {
        this.senJa1 = senJa1 == null ? null : senJa1.trim();
    }

    public String getSenZh2() {
        return senZh2;
    }

    public void setSenZh2(String senZh2) {
        this.senZh2 = senZh2 == null ? null : senZh2.trim();
    }

    public String getSenJa2() {
        return senJa2;
    }

    public void setSenJa2(String senJa2) {
        this.senJa2 = senJa2 == null ? null : senJa2.trim();
    }

    public String getSenZh3() {
        return senZh3;
    }

    public void setSenZh3(String senZh3) {
        this.senZh3 = senZh3 == null ? null : senZh3.trim();
    }

    public String getSenJa3() {
        return senJa3;
    }

    public void setSenJa3(String senJa3) {
        this.senJa3 = senJa3 == null ? null : senJa3.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}