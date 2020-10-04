package com.company.HonJaGong11_P.sec01.exam22;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {

        Integer obj1 = new Integer(100); //생성자로 인트타입 박싱
        Integer obj2 = new Integer("100"); // 생성자로 문자열 박싱
//        Integer obj3 = new Integer("100a");
        Integer obj4 = Integer.valueOf(100); // valueOf 인트타입 박싱
        Integer obj5 = Integer.valueOf("100"); // valueOf 문자열 박싱

        int value1 = obj1.intValue(); //언박싱
        int value2 = obj2.intValue();
//        int value3 = obj3.intValue();
        int value4 = obj4.intValue();
        int value5 = obj5.intValue();

        System.out.println(value1);
        System.out.println(value2);
//        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);



    }
}
