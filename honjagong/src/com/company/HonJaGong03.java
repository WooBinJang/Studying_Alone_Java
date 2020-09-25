package com.company;

public class HonJaGong03 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int result1 = ++x + 10;
        int result2 = y++ + 10;
        System.out.println(result1 + "  " + result2);
        System.out.println(x + " " + y);

        int a = 1;
        int b = -1;
        if (a > 0 ^ b > 0) {
            System.out.println("배타적 논리합 하나가 true 도다른 하난가 false 인 경우 결과가 ture 이다");
        }

        //삼항 연산자
        int score = 99;
        boolean grade = (score>90) ? true : false;
        System.out.println(grade);
    }
}
