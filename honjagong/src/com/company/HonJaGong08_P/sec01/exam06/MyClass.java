package com.company.HonJaGong08_P.sec01.exam06;
// 인터페이스의 사용 필드 , 매개변수 로컬 변수 타입으로 선언가능하다
public class MyClass {
    //필드
    RemoteControl rc = new Television(); //인터페이스 타입으로 필드 선언

    //생성자
    MyClass() {
    }

    MyClass (RemoteControl rc) { //인터페이스 타입으로 매개변수 선언
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(4);
    }
    //메소드
    void methodA () {
        RemoteControl rc = new Audio();  //인터페이스 타입으로 로컬변수 선언
        rc.turnOn();
        rc.setVolume(5);
    }

    void methodB (RemoteControl rc) { //인터페이스 타입으로 매개변수 선언
        rc.turnOn();
        rc.setVolume(6);
    }

}
