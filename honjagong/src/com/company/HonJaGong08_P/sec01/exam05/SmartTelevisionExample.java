package com.company.HonJaGong08_P.sec01.exam05;

public class SmartTelevisionExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = tv;
        rc.turnOn();
        rc.setVolume(4);
        rc.turnOff();

        Searchable searchable = tv;
        searchable.search("www.naver.com");
    }
}