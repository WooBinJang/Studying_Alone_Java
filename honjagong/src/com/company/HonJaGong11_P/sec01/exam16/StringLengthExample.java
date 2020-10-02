package com.company.HonJaGong11_P.sec01.exam16;

public class StringLengthExample {
    public static void main(String[] args) {
        String ssn = "1234561234567";
        int len = ssn.length();
        if(len ==13 ) {
            System.out.println("주민번호 길이 o");
        } else {
            System.out.println("주민번호 길이 x");
        }
    }
}
