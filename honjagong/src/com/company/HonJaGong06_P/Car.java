package com.company.HonJaGong06_P;

// 필드와 생성자와 메소드
public class Car {
    //필드
    String company = "현대자동차";
    String model = "그렌져";
    int maxSpeed = 350;
    int speed; //필드 int 초기값은 0 , String 초기값 null
    int cc;
    String color;
    String model2;
    int gas;

    //생성자
    Car() { //생성자 오버로딩
    }

    Car(String color) {
        this.color = color;
    }

    Car(String color, int cc) { // 생성자
        System.out.println(color);
        this.color = color;
        System.out.println(cc);
        this.cc = cc;
    }

    Car(String model2, String color) {
        this.model2 = model2;
        this.color = color;
    }

//    Car(String color , String model2){
//        this.model2 = model2;
//        this.color =color;
//    } 매개 변수의 타입이 같은 경우 순서만 바꿀 경우 오버로딩이 아니다.


    //메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("gas가 없다");
            return false;
        } else
            System.out.println("gas가 있다");
        return true;
    }

    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. gas잔량 :" + gas);
                gas--;
            } else {
                System.out.println("멈춥니다. " + gas);
                return;
            }
        }
    }

}
