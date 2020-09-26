package com.company.HonJaGong06_P;
// 인스턴스 final
public class Person {
    final String nation = "korean"; // 모든 사람이 대한민국 국적이라는 가정하에 korean으로 초기값을 지정
    final String ssn; // 주민번호
    String name;

    Person (String ssn, String name) {
        this.ssn = ssn; // 객체마다 초기값이 달라 생성자에서 초기값 지정
        this.name = name;
    }
}
