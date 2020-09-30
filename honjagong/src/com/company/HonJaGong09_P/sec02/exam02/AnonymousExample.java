package com.company.HonJaGong09_P.sec02.exam02;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        anonymous.remoteControl.turnOn();
        anonymous.remoteControl.turnOff();

        anonymous.method1();

        anonymous.method2(new RemoteControl() { // 매개변수내에서 인터페이스 타입선언시 익명 구현 객체 생성 가능
            @Override
            public void turnOn() {
                System.out.println("radio on");
            }

            @Override
            public void turnOff() {
                System.out.println("radio off");
            }
        });
    }
}
