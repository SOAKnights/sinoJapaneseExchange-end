package org.csu.sinojapaneseexchange;

import java.io.UnsupportedEncodingException;

public class Temp {

    public static void main(String[] args) {

        String a = "大学我你我他";
        try {
            byte[] bt = a.getBytes("SHIFT-JIS");
            System.out.println(bt.length %2 == 0);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(a.length());
        System.out.println(a.getBytes().length);


        String c = "hhh";
        System.out.println(c.length());
        System.out.println(c.getBytes().length);

    }


}
