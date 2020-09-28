package com.company.HonJaGong08_P.sec02.exam03;

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare(); Vchicle 타입으므로 Vchicle 안에 선언된 메소드만 선언 가능.

        Bus bus = (Bus) vehicle; // 강제 타입 변환
        bus.checkFare(); // Bus 타입으로 강제 타입 변환하여 Bus 메소드에서만 있는 메소드 선언이 가능
    }
}
