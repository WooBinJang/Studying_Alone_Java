package com.company.HonJaGong09_P.sec01.exam01;


public class A {
    //필드

    //생성자
    A() {
        System.out.println("A 객체 생성");
    }

    // 중첩 클래스
    class B { // 인스턴스 멤버 클래스
        //필드
        int field1;
//        static int field2; 인스턴스 멤버 클래스인 경우 인스턴스 필드와 메소드만 가능하다 정적(static) 필드 / 정적(static) 메소드 => X

        //생성자
        B() {
            System.out.println("B 객체 생성");
        }

        //메소드
        void method1() {

        }
//        static void  method2() {
//
//        } // 메소드 역시 정적 메소드는 불가능하다 왜냐하면 class B 같은 경우 class A가 없다면 쓰일 수 없기 떄문이다.
    }

    static class C { // 정적 멤버 클래스
        //필드
        int field1;
        static int field2; // 정적 멤버 클래스 같은 경우 정적 필드, 정적 메소드 선언이 가능하다.

        //생성자
        C() {
            System.out.println("C 객체 생성");
        }

        //메소드
        void method1() {
        }

        ;

        static void method2() {
        }

        ;
    }

    //메소드
    void method() {
        class D { // 로컬 클래스 (생성자나 메소드 내에서 선언된 메소드)
            //필드
            int field1;
//            static int field2; 로컬 클래스는 정적필드, 정적 메소드 불가

            //생성자
            D() {
                System.out.println("D 객체 생성");
            }

            //메소드
            void method1() {
            }

            ;
//            static void method2(){}; 로컬 클래스는 정적필드, 정적 메소드 불가
        }
        D d = new D();
        d.field1 = 5;
        d.method1();
    }
}
