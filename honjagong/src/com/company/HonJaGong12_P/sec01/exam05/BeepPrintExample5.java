package com.company.HonJaGong12_P.sec01.exam05;

import java.awt.*;

public class BeepPrintExample5 {
    public static void main(String[] args) {

       Thread thread = new Thread() { //익명 자식 객체로 작업 스레드 정의
           @Override
           public void run() {// Thread을 상속 받아 run() 메소드 재정의
               Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 생성
               for (int i = 0; i < 5; i++) {
                   toolkit.beep(); // 비프음 발생
                   try {
                       Thread.sleep(500); // 0.5초간 일시 정지
                   } catch (Exception e) {

                   }
               }
           }
       };
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
