package com.company.HonJaGong10_P.sec02.exam05;

public class ThrowsExample {
    public static void main(String[] args) { //메인 메소드에서 throws 하는것은 별로 안좋은 방법이다

        try {
            findClass();
        } catch (ClassNotFoundException e) {
//            e.printStackTrace(); //어떤 예외가 발생했는지 알려줌 디버깅 목적
            System.out.println("클래스가 존재 x");
        }
    }
    public static void findClass() throws ClassNotFoundException { // throws 메소드에서 처리하지  않은 예외를 호출한 곳으로 떠넘기는 역활
        Class clazz =Class.forName("java.lang.String2");
    }
}
