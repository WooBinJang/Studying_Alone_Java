package com.company.HonJaGong07_P.sec01.exam01;

public class DmbcellPhone extends CellPhone {
    //필드
    int channel;

    //생성자
    DmbcellPhone(String model, String color, int channel) {
//        super(); 부모클래스의 생성자가 매개변수를 가지고 있지않는경우 자동으로 생성됨
        this.channel = channel;
        this.color = color; // CellPhone의 color 필드를 상속받아 사용가능.
        this.model = model;
    }

    //메소드
    void turnOnDmb() {
        System.out.println(channel + "번 방송 수신");
    }

    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println(channel + "번으로 바꿈");
    }

    void turnOffDmb() {
        System.out.println("수신 종료");
    }
}
