package com.company.HonJaGong10_P.sec01.exam04;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data1 ="100";
        String data2 ="a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);
        // String 타입에서 숫자가 아닐 경우 NumberFormatException 예외 발생

        
    }
}
