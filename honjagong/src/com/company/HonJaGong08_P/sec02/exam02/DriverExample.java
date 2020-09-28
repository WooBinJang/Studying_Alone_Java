package com.company.HonJaGong08_P.sec02.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Bus());

        Taxi taxi = new Taxi();
        driver.drive(taxi); //매개변수의 다형성
    }
}
