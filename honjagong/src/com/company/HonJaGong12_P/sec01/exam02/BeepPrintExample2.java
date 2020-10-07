package com.company.HonJaGong12_P.sec01.exam02;

public class BeepPrintExample2 {
    public static void main(String[] args) {
       Runnable runnable = new BeepTask();
       Thread thread = new Thread(runnable);
       thread.start(); // start()을 호출해야만 새로운 흐름 시작

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
