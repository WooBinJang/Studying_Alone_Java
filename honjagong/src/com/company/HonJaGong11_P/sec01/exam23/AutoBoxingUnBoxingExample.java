package com.company.HonJaGong11_P.sec01.exam23;

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {

        Integer obj1 = 100;
        // 자동 박싱
        // 포장 클래스 타입의 기본값이 대입될 경우 자동 박싱 발생
        Integer obj2 = new Integer("100");
        // 포장 클래스 타입과 기본값 타입이 달라  자동 박싱 X

        int result = obj1;
        // 자동 언박싱
        System.out.println(result);


        int value = obj1 + 1000;
        // 객체와 상수와 연산 할 수 없으나 자동 언박싱이 되어 연산이 가능하다.
        // 기본 타입에 포장 객체가 대입되는 경우 및 연산에서 자동 언박싱 발생
        System.out.println(value);
        // 자동 언박싱
    }
}
