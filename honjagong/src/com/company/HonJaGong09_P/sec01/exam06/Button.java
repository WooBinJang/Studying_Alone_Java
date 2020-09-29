package com.company.HonJaGong09_P.sec01.exam06;

public class Button {
    //필드
        OnclickListener listener; // 인터페이스 타입의 필드
    
        //생성자
    
        //메소드
        void setListener(OnclickListener listener) { //인터페이스 구현한(onclick 메소드를 구현한)
            this.listener = listener; //인터페이스 타입의 객체을 필드 리스너에 저장
        }

    void click() {
        listener.onclick(); //필드의 다형성
    }

    static interface OnclickListener { //중첩 인터페이스
        void onclick();
    }
}
