package com.company.HonJaGong10_P.sec01.exam03;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String[] arg = {"A", "B","C"};
        if (arg.length == 2) {
            String data1 = arg[0];
            String data2 = arg[1];

            System.out.println(data1);
            System.out.println(data2);
        } else {
            System.out.println("두 개의 실행 매개값 필요");
        }
    }
}
