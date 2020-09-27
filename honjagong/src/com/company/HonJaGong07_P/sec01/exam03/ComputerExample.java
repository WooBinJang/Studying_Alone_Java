package com.company.HonJaGong07_P.sec01.exam03;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println(calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println(computer.areaCircle(r));
        // 부모가 가진 메소드가 아닌 자식개체에서 재정의한 메소드가 호출 된다
    }
}
