package com.company.HonJaGong11_P.sec01.exam18;

public class StringSubstringExample {
    public static void main(String[] args) {

        String ssn ="123456-1234567";

        String str1 = ssn.substring(0,6); // 인덱스 0 이상부터 인덱스 6미만까지
        System.out.println(str1);

        String str2 = ssn.substring(6); // 인덱스 6 이상부터 끝까지
        System.out.println(str2);
}
}
