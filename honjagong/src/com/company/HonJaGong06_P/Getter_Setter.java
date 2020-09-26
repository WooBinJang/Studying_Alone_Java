package com.company.HonJaGong06_P;

public class Getter_Setter {
    //필드
    private int speed;
    private boolean stop;
    //생성자

    //메소드
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(speed <0){
            this.speed =0;
            return; //void 타입에서 return 시 메소드를 끝냄
        } else {
            this.speed = speed;
        }
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if(stop){
            speed =0;
        }
    }
}
