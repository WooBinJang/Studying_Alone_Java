package com.company.HonJaGong11_P.sec01.exam13;

public class StringEqualsExample {
    public static void main(String[] args) {
        String str1 = new String("가나다");
        String str2 = "가나다";

        if(str1 == str2) {
            System.out.println("같은 객체 참조");
        } else {
            System.out.println("다른 객체 참조");
        }

        if(str1.equals(str2)){
            System.out.println("같은 문자열");
        } else {
            System.out.println("다른 문자열");
        }
    }
}
