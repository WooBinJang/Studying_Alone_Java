package com.company.HonJaGong08_P.sec02.exam01;

public class Car {
    Tire frontLeftTire = new HankokTire();
    Tire frontRightTire = new HankokTire();
    Tire backLeftTire = new HankokTire();
    Tire backRightTire = new HankokTire();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }

}
