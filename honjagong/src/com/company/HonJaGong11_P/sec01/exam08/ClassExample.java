package com.company.HonJaGong11_P.sec01.exam08;

import java.util.SortedMap;

public class ClassExample {
    public static void main(String[] args) throws ClassNotFoundException {

        Class clazz = Car.class;

        Class clazz2 = Class.forName("com.company.HonJaGong11_P.sec01.exam08.Car");

        Car car = new Car();
        Class clazz3 = car.getClass();

        System.out.println(clazz == clazz2);
        System.out.println(clazz2 == clazz3);
        System.out.println(clazz ==clazz3); // 세개의 객체 전부 다 같은 Car 객체번지를 가르킨다.

        System.out.println(clazz.getName()); // 패키지명 + 클래스명
        System.out.println(clazz.getSimpleName()); // 클래스명
        System.out.println(clazz.getPackage()); // 패키지명
    }

}
