package com.company.HonJaGong12_P.sec01.exam04;

public class BeepPrintExample4 {
    public static void main(String[] args) {

       Thread thread = new BeepThread();
       // Runnable을 생성하지 않고 Thread의 하위 클래스로 작업 스레드를 정의
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
