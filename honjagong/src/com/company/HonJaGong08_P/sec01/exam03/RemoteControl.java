package com.company.HonJaGong08_P.sec01.exam03;

public interface RemoteControl { // 인터페이스
    //상수
    public static final int MAX_VOLUME = 10;
    int MIN_VOLUME = 0; //  인터페이스인 경우 상수 필드만 가능함으로 (public static final) 생략가능하다

    //메소드
    public abstract void turnOn();
    void turnOff(); // 인터페이스인 경우 추상 메소드만 선언이 가능함으로 public abstract 생략가능하다  .
    void setVolume(int volume);
}
