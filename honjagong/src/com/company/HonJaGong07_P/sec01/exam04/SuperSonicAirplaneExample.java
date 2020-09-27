package com.company.HonJaGong07_P.sec01.exam04;

public class SuperSonicAirplaneExample {
    public static void main(String[] args) {
        SuperSonicAirplane sa = new SuperSonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SuperSonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SuperSonicAirplane.NORMAL;
        sa.fly();

    }
}
