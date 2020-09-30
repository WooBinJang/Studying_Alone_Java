package com.company.HonJaGong09_P.sec02.exam01;

public class AnonymousExample {
    public static void main(String[] args) {

        Anonymous anonymous = new Anonymous();
        anonymous.field.wake();
//        anonymous.field.work(); 익명 자식객체 에서만 선언 된 메소드는 작접 선언 불가

        anonymous.method1();// 로컬 변수에 선언한 익명 객체의 메소드는 부모 객체의 메소드 재정의에서 선언을 해주지 않으면 익명 객체의 메소드는 선언 되지않는다.

        anonymous.method2(new Person(){ // 매개변수 안에 익명 자식 객체 생성 가능
            void study() {
                System.out.println("공부");
            }

            @Override
            void wake() {
                System.out.println("8시 일어난다");
                study();
            }
        });


    }
}
