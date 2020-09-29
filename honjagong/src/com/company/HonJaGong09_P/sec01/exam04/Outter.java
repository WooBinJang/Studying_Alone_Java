package com.company.HonJaGong09_P.sec01.exam04;

public class Outter {
    public void method(final int var) {
        int localVariable = 1;
//        var =10;
//        localVariable= 10; 로컬 클래스에서 매개 변수나 로컬 변수는 final 특성이 부여 됨 final 생략 가능
        class Inner { //로컬 클래스 : 메소드나 생성자 안에 생성한 클래스
            void method2() {
                int result = var + localVariable;
            }
        }
    }
}
