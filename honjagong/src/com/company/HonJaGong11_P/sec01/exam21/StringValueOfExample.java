package com.company.HonJaGong11_P.sec01.exam21;

public class StringValueOfExample {
    public static void main(String[] args) {

        int a = 10;

        String str1 = String.valueOf(10);
        String str2 = String.valueOf(10.5);
        String str3 = String.valueOf(true);
        // 정수, 실수, boolean 타입을 String 타입으로 변환
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

//        System.out.println(a.length()); 정수타입은 length 사용 x
        System.out.println(str1.length());
    }
}
