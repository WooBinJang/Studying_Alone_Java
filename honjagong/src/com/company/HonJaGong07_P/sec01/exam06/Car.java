package com.company.HonJaGong07_P.sec01.exam06;

public class Car {
    //필드
    public int speed;
    //생성자

    //메소드
    public void speedUp(){
        speed++;
    }
    public  final void  stop(){ // 메소드 앞에 fianl 있을 경우 재정의 불가
        System.out.println("차 멈춤");
        speed =0;
    }
}
