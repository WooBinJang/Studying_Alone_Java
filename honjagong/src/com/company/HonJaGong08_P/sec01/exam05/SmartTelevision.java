package com.company.HonJaGong08_P.sec01.exam05;

public class SmartTelevision implements RemoteControl,Searchable {
    // 다중 인터페이스가 가능하다.

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("SmartTelevision ON");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartTelevision OFF");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > com.company.HonJaGong08_P.sec01.exam04.RemoteControl.MAX_VOLUME) {
            this.volume = com.company.HonJaGong08_P.sec01.exam04.RemoteControl.MAX_VOLUME;
        } else if (volume < com.company.HonJaGong08_P.sec01.exam04.RemoteControl.MIN_VOLUME) {
            this.volume = com.company.HonJaGong08_P.sec01.exam04.RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("SmartTelevision 볼륨: " + this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url +"검색");

    }
}
