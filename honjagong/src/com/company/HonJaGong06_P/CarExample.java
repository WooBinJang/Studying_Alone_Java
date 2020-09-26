package com.company.HonJaGong06_P;

//필드와 생성자
public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("검정", 3000); // 객체 생성
        // 생성자의 매개 변수값을 입력해줘야 함.
        System.out.println(myCar.company); // 필드 사용
        System.out.println(myCar.maxSpeed);
        myCar.maxSpeed = 400;
        System.out.println(myCar.maxSpeed);
        System.out.println(myCar.speed); // int의 초기값은 0이다.

        System.out.println("-----------------------------------------");

        myCar.setGas(10);
        boolean gasState = myCar.isLeftGas();
        if (gasState) {
            System.out.println("출발");
            myCar.run();
        }

        if (myCar.isLeftGas()) {
            System.out.println("gas가 있다");
        } else
            System.out.println("gas가 없다");

    }
}
