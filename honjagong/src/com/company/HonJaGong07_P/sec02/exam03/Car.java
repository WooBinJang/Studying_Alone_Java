package com.company.HonJaGong07_P.sec02.exam03;

public class Car {
    //필드
    Tire frontLeftTire = new Tire("앞왼", 6);
    Tire frontRightTire = new Tire("앞오", 2);
    Tire backLeftTire = new Tire("뒤왼", 3);
    Tire backRightTire = new Tire("뒤오", 4);

    //생성자

    //메소드
    int run() {
        System.out.println("차가 달린다");
        if (frontLeftTire.roll() == false) {
            stop();
            return 1;
        }
        if (frontRightTire.roll() == false) {
            stop();
            return 2;
        }
        if (backLeftTire.roll() == false) {
            stop();
            return 3;
        }
        if (backRightTire.roll() == false) {
            stop();
            return 4;
        } else
            return 0;
    }

    void stop() {
        System.out.println("차가 멈춤");
    }
}
