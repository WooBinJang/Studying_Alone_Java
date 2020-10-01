package com.company.HonJaGong10_P.sec02.exam01;

public class TryCatchFinalExample {
    public static void main(String[] args) {
        String str = null;
//        System.out.println(str.length()); 실행 예외는 컴파일러가 체크 하지않음

        try {
            Class clazz = Class.forName("java.lang.String2"); // 일반 예외는 컴파일러가 체크함
            System.out.println("정상 실행");
        } catch (ClassNotFoundException e) {
            System.out.println("클레스 존재 x");
        }
    }
}
