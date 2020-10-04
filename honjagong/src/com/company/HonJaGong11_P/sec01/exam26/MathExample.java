package com.company.HonJaGong11_P.sec01.exam26;

public class MathExample {
    public static void main(String[] args) {
        int v1 = Math.abs(-5);
        System.out.println(v1); // 절대값

        double v2 = Math.ceil(4.4);
        System.out.println(v2);// 올림

        double v3 = Math.floor(4.9);
        System.out.println(v3); // 버림

        int v4 = Math.max(32,1);
        System.out.println(v4); // 최대값

        int v5 =Math.min(2,4);
        System.out.println(v5); // 최소값

        double v6 = Math.random();
        System.out.println(v6); // 랜덤 값 (난수 생성)

        double v7 = Math.rint(3.5);
        System.out.println(v7); // 가까운 실수 (정수 타입 변수로 X)

        long v8 = Math.round(3.5); // 정수 실수 타입 둘 다 가능
        System.out.println(v8); // 반올림
    }
}
