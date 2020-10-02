package com.company.HonJaGong11_P.sec01.exam05;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("구글","안드로이드");

        String strobj = smartPhone.toString();

        System.out.println(strobj); // 패키지와 클래스이름과 번지가 출력
        System.out.println(smartPhone);

    }
}
