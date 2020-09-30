package com.company.HonJaGong09_P.sec02.exam01;

public class Anonymous {
    //필드
    Person field = new Person() { //필드에서 변수에 익명 객체 생성  
        void work() {
            System.out.println("출근");
        } // 자식 익명 객체 메소드는 혼자 사용 불가

        @Override
        void wake() { // 부모 객체에 있는 메소드를 재정의 해준다
            System.out.println("6시 일어난다");
            work(); // 부모 객체의 있는 메소드 안에 자식 익명 객체의 메소드를 사용하는 것은 가능하다.
        }
    };

    //생성자

    //메소드
    void method1() {
        Person localVar = new Person() { //메소드 안에 있는 로컬 변수의 익명 객체 생성 가능
            void walk() {
                System.out.println("산책");
            } // 메소드를 선언 할때 익명 객체의 메소드는 선언 되지 않는다.

            @Override
            void wake() {
                System.out.println("7시 일어난다");
                walk(); // 즉, 부모 객체의 메소드 재정의 할때 선언해주어야 같이 선언이 된다.
            }
        };

        localVar.wake(); // locarVar는 Person 부모 객체 타입이므로 wake() 메소드 선언 가능
//        localVar.walk(); // 익명 자식 객체 메소드인 walk()는 메소드 선언 불가
    }

    void method2(Person person) { // 메소드의 매개변수안에 부모타입의 매개변수를 호출 할때 익명 객체 생성
        person.wake();
    }
}
