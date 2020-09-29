package com.company.HonJaGong09_P.sec01.exam03;

public class A {
    int field1; //인스턴스 필드

    void method1() { } //인스턴스 메소드

    static int field2; //정적 필드

    static void method2() {
    } //정적 메소드

    class B { //인스턴스 맴버 클래스 => A 객체가 있어야만 사용 가능!! =>A의 필드와 메소드가 정적이든 인스턴스이든 상관없음
        void method() {                                     
            field1 = 1;
            method1();

            field2 = 1;
            method2();
        }
    }

    static class C { // 정적 멤버 클래스 => A 객체가 없이도 사용 가능!! => A의 인스턴스 필드 ,인스턴스 메소드 사용 불가 
        void method() {
//            field1 =0;
//        method1();

            field2 = 1;
            method2();

        }
    }
}
