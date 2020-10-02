package com.company.HonJaGong11_P.sec01.exam10;

public class ByteToStringExmaple {
    public static void main(String[] args) {
        byte [] bytes ={72,101,108,108,111,32,74,97,118,97};

        String str = new String(bytes); //String 클래스에 선언된 생성자 중 하나
        System.out.println(str);

        String str2 = new String(bytes, 6, 4); // 6번째부터 4개
        System.out.println(str2);
    }
}
