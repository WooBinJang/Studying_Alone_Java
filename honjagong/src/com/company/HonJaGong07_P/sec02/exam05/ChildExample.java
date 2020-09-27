package com.company.HonJaGong07_P.sec02.exam05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child(); // 자동 타입 변환  부모 클래스 <- 자식 클래스
        parent.method1();
        parent.method2();
//        parent,method3(); 자식 클래스에 있는 메소드는 사용 불가
        System.out.println("------------------------------------------------");
        Child child = (Child) parent; // 강제 타입 변환 (단, 자식 타입이 부모 타입으로 자동 타입 변환한 후 다시 반대로 변환할 떄 사용 할 수 있다.)
        child.method1();
        child.method2();
        child.method3();
    }
}
