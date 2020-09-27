package com.company.HonJaGong07_P.sec02.exam03;

public class HankookTire extends Tire {

    //생성자
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    //메소드
    @Override
    boolean roll() {
        ++accumulateRotation;
        if (accumulateRotation < maxRotation) {
            System.out.println(location+"한국타이어 수명 :" + (maxRotation - accumulateRotation));
            return true;
        } else {
            System.out.println(location+"한국타이터 펑크");
            return false;
        }
    }
}
