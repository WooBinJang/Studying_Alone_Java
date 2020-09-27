package com.company.HonJaGong07_P.sec02.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child; // 자동 타입 변환

        parent.method1(); // 부모 클래스에 있는 메소드가 호출 됨
        parent.method2(); // 메소드 재정의가 된 메소드가 호출 됨
//        parent.method3(); 자식 클래스에만 있는 메소드는 사용 x
    }
}
