package com.company.HonJaGong11_P.sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {
    public static void main(String[] args) {

        String str = "안녕하세요";

        byte [] bytes1 = str.getBytes();
        System.out.println("byte1 length : " +bytes1.length);
        // 15  => default가 UTF-8  한글 한글자당 3 byte 인코딩

        String str1 = new String(bytes1);
        System.out.println("byte1 -> String : " + str1);
        //디코딩
        try {
            byte [] bytes2 =str.getBytes("EUC-KR");
            System.out.println("byte2 length : " +bytes2.length);
            String str2 = new String(bytes2,"EUC-KR");
            System.out.println("byte2 -> String : " + str2);

            byte [] bytes3 =str.getBytes("UTF-8");
            System.out.println("byte3 length : " +bytes3.length);
            String str3 = new String(bytes3,"UTF-8");
            System.out.println("byte3 -> String : " + str3);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
