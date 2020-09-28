package com.company.HonJaGong08_P.sec02.exam05;

public class Example {
    public static void main(String[] args) {

        ImplementationC impl =new ImplementationC();
        InterfaceA ia =impl; // 자동 형 변환
        ia.methodA();
        
        InterfaceB ib =impl;
        ib.methodB();
        
        InterfaceC ic =impl; //인터페이스 A,B를 상속하고있긴떄문에 메소드 a,b,c 호출 가능
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
