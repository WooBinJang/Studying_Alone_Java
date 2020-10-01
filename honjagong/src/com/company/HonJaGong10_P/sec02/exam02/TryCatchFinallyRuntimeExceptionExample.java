package com.company.HonJaGong10_P.sec02.exam02;

public class TryCatchFinallyRuntimeExceptionExample {
    public static void main(String[] args) {
        String [] arg = {"10","20"};
        String data1 = null;
        String data2 = null;

        try {
            data1 = arg[0];
            data2 = arg[1];
        } catch (Exception e) {
            System.out.println("실행 매개값의 수 부족"); //예외 발생 시
            return; //  종료
        } // finally 문이 필요 없다면 생략 가능

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (Exception e) {
            System.out.println("숫자로 변환 x");
        } finally {
            System.out.println("다시 실행"); //항상 실행
        }
    }
}
