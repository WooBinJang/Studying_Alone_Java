package com.company;

public class HonJaGong02 {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        int c = a + b;
        double d = c; // 큰 허용 범위 <- 작은 허용 범위 = 자동 형 변환
        int f = (int) d; // 작은 허용 범위 <- 큰 허용 범위 = 강제 형 변환
        // 문자열을 기본 타입으로 변경!!
        String str = "22";
        int str2 = Integer.parseInt(str);
        // Integer.parseInt() 스트링 -> 인트
        // Double.parseDouble() 스트링 -> 더블
        System.out.println(str2);

        String s1 = 1 + 2 + "3"; // 1 + 2 연산 후 33
        String s2 = "1" + 2 + 3; //  123
        String s3 = 1 + "2" + 3; // 123
        System.out.println(s1 +"      " + s2 +"    "+ s3);

    }
}
