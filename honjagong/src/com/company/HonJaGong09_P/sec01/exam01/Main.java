package com.company.HonJaGong09_P.sec01.exam01;

public class Main {
    public static void main(String[] args) {
        A a = new A(); // A 객체를 생성
        A.B b =  a.new B(); // B객체는 A객체가 있어야 생성 가능함  A.B =>  A 클래스 안에 있는 B 클래스 
                            // a.new B() => 생성한 a객체에서 B객체를 생성하여 b라는 변수에 대입
        b.field1 =3; // b에 있는 필드 사용 가능
        b.method1(); // b에 있는 메소드 사용 가능

        A.C c = new A.C(); // A 객체를 따로 생성하지 않고 C 객체를 생성 가능하다
        c.field1 =4;
        c.method1();

        A.C.field2=5;
        A.C.method2(); // 이름만으로 접근하여 메소드 호출 가능

        a.method();
    }
}
