package com.company.HonJaGong11_P.sec01.exam19;

public class StringToUpperLowerCaseExample {
    public static void main(String[] args) {
        String str1 ="JAVA programming";
        String str2 ="Java programming";

        System.out.println(str1.equals(str2));
        // 자바에서 문자열 비교시 대소문자 구분을 한다.

        String upperStr1 = str1.toUpperCase();
        String upperStr2 = str2.toUpperCase();
        System.out.println(upperStr1.equals(upperStr2) +"  "+ upperStr1 + " " +upperStr2);

        System.out.println("----------------------------------------------");

        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        System.out.println(lowerStr1.equals(lowerStr2) +"  " + lowerStr1 + " " +lowerStr2);



    }
}
