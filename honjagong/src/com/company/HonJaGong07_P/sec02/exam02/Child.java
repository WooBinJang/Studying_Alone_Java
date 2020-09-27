package com.company.HonJaGong07_P.sec02.exam02;

public class Child extends Parent {
    @Override
    public void method2() { // 메소드 재정의
        System.out.println("자식클래스 메소드2");
    }
    public void method3() {
        System.out.println("자식클래스 메소드3");
        
    }
}
