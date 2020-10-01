package com.company.HonJaGong10_P.sec01.exam01;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String s =null;
        System.out.println(s.length());
        //객체가 없는 상태에서 참조변수를 가지고 사용한 경우 NullPointerException
    }
}
