package com.company.HonJaGong09_P.sec02.exam03;

public class Window {
    //필드
    Button button1 = new Button();
    Button button2 = new Button();

    Button.ONClickListener listener = new Button.ONClickListener() { //인터페이스 익명 객체 생성
        @Override
        public void onClick() {
            System.out.println("전화 걸기");
        } // 인터페이스 이므로 메소드 재정의
    };

    //생성자
    Window() {
        button1.setOnClickListener(listener); // 필드에서 생성한 인터페이스 익명 객체를 대입
        button2.setOnClickListener(new Button.ONClickListener() { //매개값이 인터페이스 이므로 익명 객체 생성해서 매개값 대입
            @Override
            public void onClick() {
                System.out.println("메세지 보내기");
            }
        });
    }
}
