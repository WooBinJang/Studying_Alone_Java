package com.company.HonJaGong07_P.sec03.exam01;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone();  추상 클래스 이므로 new 연산자로 생성 불가
         SmartPhone smartPhone = new SmartPhone("홍길동");
         smartPhone.turnOn();
         smartPhone.internetSearch();
         smartPhone.turnOff();
    }
}
