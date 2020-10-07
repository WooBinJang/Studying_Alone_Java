package com.company.HonJaGong12_P.sec01.exam02;

import java.awt.*;

public class BeepTask implements Runnable {

    @Override
    public void run() {//Runnable 인터페이스 타입이기 때문에 구현객체에서 run() 메소드 재정의
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolkit 객체 생성
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 비프음 발생
            try {
                Thread.sleep(500); // 0.5초간 일시 정지
            } catch (Exception e) {

            }
        }
    } // 작업 스레드 실행 코드
}
