package com.company.HonJaGong06_P;
//메소드
public class Calculator {
    //필드

    //생성자

    //메소드
    void powerOn() { // void 타입일 경우 return값이 없다.
        System.out.println("전원 ON");
    }

    int plus(int x, int y) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y); // plus 메소드는 리턴값이 있기에 그 리턴값을 담을 수 있는 변수가 있어야 한다.
        double result = sum / 2;
        return result;
    }

    void excute() {
        double result = avg(7, 10);
        println("실행결과: " + result); // println메소드는 리턴값이 없기에 변수가 필요없다.,
    }

    void println(String message) {
        System.out.println(message);
    }

    double divide(double x, double y) {
        double result = x / y;
        return result;
    }

    int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    int sum2(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    double areaRectangle(double width) {
        return width * width;
    }

    double areaRectangle(double width, double height) {
        return width * height;
    }// 메소드 오버로딩


    void powerOff() {
        System.out.println("전원 OFF");
    }

}
