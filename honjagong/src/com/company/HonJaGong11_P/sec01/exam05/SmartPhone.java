package com.company.HonJaGong11_P.sec01.exam05;

public class SmartPhone {
    //필드
    String company;
    String os;

    //생성자
    SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }
    //메소드

    @Override // toString 재정의
    public String toString() {
        return company + " " + os;
    }
}
