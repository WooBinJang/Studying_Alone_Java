package com.company.HonJaGong09_P.sec02.exam02;

public class Anonymous {
    //필드
    RemoteControl remoteControl = new RemoteControl() { // 필드에 인터페이스 타입의 익명 구현 객체 선언
        @Override
        public void turnOn() {
            System.out.println("tv on");
        }

        @Override
        public void turnOff() {
            System.out.println("tv off");
        }
    };
    //생성자

    //메소드
    void method1() {
        RemoteControl locarval = new RemoteControl() { //인터페이스 타입의 로컬 변수에  익명 구현 객체 선언
            @Override
            public void turnOn() {
                System.out.println("audio on");
            }// 인터페이스는 추상 메소드 이므로 무조건 메소드 재정의 해주어야 한다.

            @Override
            public void turnOff() {
                System.out.println("audio off");
            }
        };
        locarval.turnOn(); // 위에서 메소드 재정의만 했기 때문에 메소드 선언까지 해준다
        locarval.turnOff();
    }

    void method2(RemoteControl rc) { // 매개변수내에서 인터페이스 타입 선언
        rc.turnOn();
        rc.turnOff();
    }

}


