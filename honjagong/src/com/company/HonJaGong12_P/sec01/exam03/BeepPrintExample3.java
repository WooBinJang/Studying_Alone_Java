package com.company.HonJaGong12_P.sec01.exam03;

import com.company.HonJaGong12_P.sec01.exam02.BeepTask;

import java.awt.*;

public class BeepPrintExample3 {
    public static void main(String[] args) {

       Thread thread = new Thread(new Runnable() { // 객체를 따로 생성하지 않고 익명객체를 사용하여 코드양을 줄였다.
           @Override
           public void run() {
               Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 생성
               for (int i = 0; i < 5; i++) {
                   toolkit.beep(); // 비프음 발생
                   try {
                       Thread.sleep(500); // 0.5초간 일시 정지
                   } catch (Exception e) {

                   }
               }
           }
       });
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
