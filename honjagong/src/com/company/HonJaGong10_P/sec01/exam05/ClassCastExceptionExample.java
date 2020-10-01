package com.company.HonJaGong10_P.sec01.exam05;

import com.company.HonJaGong07_P.sec02.exam01.C;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // 자동 형변환
        Dog dog = (Dog) animal; // 강제 형변환
//        Cat cat = (Cat) animal; //ClassCastException 예외 발생
        // 상위 및 하위 클래스 그리고 구현 클래스와 인터페이스 간 타입 변환 가능하나 이와 같은 관계가 아닌 경우 발생

        chageDog(new Cat()); // if 조건 성립 안함
    }

    static void chageDog(Animal animal) {
        if (animal instanceof Dog) { // animal 객체가 Dog 타입인지 확인
            Dog dog = (Dog) animal;
        }
    }
}
