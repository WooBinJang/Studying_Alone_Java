package com.company.HonJaGong07_P.sec01.exam03;

public class Computer extends Calculator{
    @Override // 컴파일 과정에서 오버라이딩이 제대로 되었는지 확인 해준다
    double areaCircle(double r) {
        System.out.println("Computer 객체 areaCircle() 메소드 호출");
        return Math.PI * r * r;
    } //메소드 재정의 오버라이딩
}
