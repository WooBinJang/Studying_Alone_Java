package com.company.HonJaGong06_P;

// 메소드
public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();
        int result1 = myCalc.plus(5, 6);
        System.out.println(result1);
        double result2 = myCalc.divide(23, 5);
        System.out.println(result2);
        myCalc.powerOff();

        int[] arr = {1, 2, 3, 4, 5, 6};
        int result3 = myCalc.sum(arr);
        System.out.println(result3);

        int result4 = myCalc.sum2(1, 2, 3, 4, 5, 6); //값의 목록만 넘겨주는 방식
        System.out.println(result4);

        myCalc.excute();

        double result5 = myCalc.areaRectangle(10);
        double result6 = myCalc.areaRectangle(10, 20);
        System.out.println("정사각형 " + result5);
        System.out.println("직사각형 " + result6);

    }
}
