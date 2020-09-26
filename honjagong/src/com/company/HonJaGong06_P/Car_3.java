package com.company.HonJaGong06_P;
// 인스턴스 필드 객체 생성 또는 static 정적필드 사용
public class Car_3 {
    int speed; //인스턴스 필드

    void run() {
        System.out.println(speed + "으로 달립니다");
    }

    public static void main(String[] args) {
        Car_3 car = new Car_3(); //인스턴스 필드와 메소드를 사용하기위해서 객체를 생성해야한다.
        // 또는 int, void 앞에 static을 붙혀 정적 필드와 정적메소드로 바꾸면 객체를 생성하지않아도 사용가능하다.
        car.speed = 50;
        car.run();
    }
}
