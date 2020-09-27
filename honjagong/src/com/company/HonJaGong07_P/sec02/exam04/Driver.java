package com.company.HonJaGong07_P.sec02.exam04;

public class Driver {
    public void drive(Vehicle vehicle){ //Vehicle 매개변수뿐만 아니라 자식 클래스도 매개변수로 가능하다
        vehicle.run();
    }
}
