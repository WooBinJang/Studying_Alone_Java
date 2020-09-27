package com.company.HonJaGong07_P.sec02.exam03;

public class KumhoTire extends Tire{
    //생성자
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    //메소드
    @Override
    boolean roll() {
        ++accumulateRotation;
        if (accumulateRotation < maxRotation) {
            System.out.println(location +"금호타이어 수명 :" + (maxRotation - accumulateRotation));
            return true;
        } else {
            System.out.println(location +"금호타이터 펑크");
            return false;
        }
    }
}
