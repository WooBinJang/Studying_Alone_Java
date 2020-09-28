package com.company.HonJaGong08_P.sec01.exam04;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;
        rc= new Television(); // 인터페이스를 활용한 다형성
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

    }
}
