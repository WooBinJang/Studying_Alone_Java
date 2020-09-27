package com.company.HonJaGong07_P.sec01.exam01;

public class CellPhone {

    //필드
    String model;// defult 같은 패키지내에서는 상속 시 사용 가능
    String color;

    //생성자
    CellPhone (){
        System.out.println("CellPhone 호출됨");
    }
    //메소드
    void powerOn() {
        System.out.println("전원 ON");
    }

    void powerOff() {
        System.out.println("전원 Off");
    }

    void bell() {
        System.out.println("Bell");
    }

    void sendVoice(String message) {
        System.out.println("자가" + message);
    }

    void receiveVocie(String message) {
        System.out.println("상대방" + message);
    }

    void hangUp() {
        System.out.println("전화 종료");
    }

}
