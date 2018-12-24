package org.csu.sinojapaneseexchange.interaction;

public class Sentence {

    private String senZh;

    private String senJa;


    public Sentence() {
    }

    public Sentence(String senZh, String senJa) {
        this.senZh = senZh;
        this.senJa = senJa;
    }

    public String getSenZh() {
        return senZh;
    }

    public void setSenZh(String senZh) {
        this.senZh = senZh;
    }

    public String getSenJa() {
        return senJa;
    }

    public void setSenJa(String senJa) {
        this.senJa = senJa;
    }
}
