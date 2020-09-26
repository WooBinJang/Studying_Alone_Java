package com.company.HonJaGong06_P;
// 싱글톤
public class Singleton {

    private  static  Singleton singleton = new Singleton(); //private 클래스 내부에서 사용가능 외부 클래스에서 사용불가

    private Singleton() {

    }

    static Singleton getInstance() {
        return singleton; // 객체의 번지를 리턴
    }
}
