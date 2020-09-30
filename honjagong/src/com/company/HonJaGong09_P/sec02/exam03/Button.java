package com.company.HonJaGong09_P.sec02.exam03;

public class Button {
    static interface ONClickListener {
        void onClick();
    } // 중첩 인터페이스

    //필드
    private ONClickListener listener; //필드에 인터페이스 익명 객체 생성

    //메소드
    public void setOnClickListener(ONClickListener listener) {//매개변수에 인터페이스 익명 객체를 매개값으로
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
    }
}
