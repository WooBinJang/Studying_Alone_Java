package com.company.HonJaGong11_P.sec01.exam07;

public class SystemTimeExmaple {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        int sum=0;
        for (int i = 0; i <= 10000000; i++) {
            sum += i;
        }
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);
    }
}
