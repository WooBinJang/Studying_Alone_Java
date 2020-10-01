package com.company.HonJaGong10_P.sec01.exam02;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int result = arr[1] + arr[3];
        System.out.println(result);
        //배열에서 인덱스 범위를 초과 하는 경우 ArrayIndexOutOfBoundsException 예외 발생
    }
}
