package com.company.HonJaGong06_P;

//정적 멤버
public class Calculator_2Example {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator_2.pi; // static(정적) 필드 라서 new 연산자로 객체를 생성하지 않아도 된다.
        System.out.println(result1);
        int result2 = Calculator_2.plus(4, 5);
        int result3 = Calculator_2.minus(9, 4);
        System.out.println(result2 + "   " + result3);
    }
}
