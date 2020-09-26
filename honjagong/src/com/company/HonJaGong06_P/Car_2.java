package com.company.HonJaGong06_P;
//this
public class Car_2 {
    //필드
    String model;
    int speed;

    //생성자
    Car_2(String model) {
        this.model = model;
    }

    //메소드
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i);
            System.out.println(this.model + "달린다." + this.speed);// 매개변수의 model, speed가 없기 때문에 this. 를 생략 가능하지만 가독성을 위해 써주는게 좋다
        }
    }
}
