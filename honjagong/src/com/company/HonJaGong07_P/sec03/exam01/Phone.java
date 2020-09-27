package com.company.HonJaGong07_P.sec03.exam01;

public abstract class Phone { // 추상 클래스 선언
    //필드
    public String owner;
    //생성자
    public Phone(String owner){
        this.owner =owner;
    }
    //메소드
    public void turnOn(){
        System.out.println("폰 ON");
    }
    public void turnOff(){
        System.out.println("폰 OFF");
    }
}
