package com.company.HonJaGong11_P.sec01.exam25;

public class ValueCompareExample {
    public static void main(String[] args) {

        Integer obj1 =300;
        Integer obj2 =300;

        System.out.println(" == 연산자 " + (obj1 == obj2));
        // 이와 같이 false가 나온다 -128~ 127 까지는 같은 객체에 저장하여 일관성이 없어 .equals() 를 사용을 권장한다.
        System.out.println(" .equals() 연산자 " + (obj1.equals(obj2)));
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println(" == 연산자" + (obj3==obj4));
    }
}
