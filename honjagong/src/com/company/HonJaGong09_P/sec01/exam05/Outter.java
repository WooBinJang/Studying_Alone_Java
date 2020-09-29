package com.company.HonJaGong09_P.sec01.exam05;

public class Outter {
    String field = "Outter-field";

    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-field";

        void method() {
            System.out.println("Nested-method");
        }

        void print() {
            System.out.println(this.field); // this.은 현재 객체 내부의 필드를 참조한다
            this.method(); // 메소드 역시 현재 객체 내부의 메소드를 참조한다
            System.out.println(Outter.this.field); // 바깥 필드을 참조 하기위해서 this. 앞에 객체 이름을 써준다
            Outter.this.method();// 메소드 역시 바깥 객체의 메소드를 호출하기의해서 this. 앞에 객체 이름을 써준다
        }
    }
}
