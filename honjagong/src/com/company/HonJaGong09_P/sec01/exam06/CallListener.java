package com.company.HonJaGong09_P.sec01.exam06;

public class CallListener implements Button.OnclickListener { //인터페이스 구현객체
    @Override
    public void onclick() {
        System.out.println("전화걸기");
    }
}
