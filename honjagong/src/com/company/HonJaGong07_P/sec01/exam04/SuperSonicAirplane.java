package com.company.HonJaGong07_P.sec01.exam04;

public class SuperSonicAirplane extends AirPlane {
    //필드
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    public int flyMode = NORMAL;
    //생성자
    //메소드

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속비행(자식 클래스 메소드)");
        } else {
            super.fly(); // 부모에 있는 fly 메소드 호출 할 떄는 super. 사용
        }
    }
}
