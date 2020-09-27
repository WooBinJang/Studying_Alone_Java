package com.company.HonJaGong07_P.sec02.exam03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();

        for (int i = 0; i < 15; i++) {
            int problemLocation = car.run();
            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼 한국타이어 교체");
                    car.frontLeftTire = new HankookTire("앞왼", 15);
                    break;
                case 2:
                    System.out.println("앞오 금호타이어 교체 ");
                    car.frontRightTire = new KumhoTire("앞오", 12);
                    break;
                case 3:
                    System.out.println("뒤왼 한국타이어 교체");
                    car.backLeftTire = new HankookTire("뒤왼", 13);
                    break;
                case 4:
                    System.out.println("뒤오 금호타이어 교체");
                    car.backRightTire = new KumhoTire("뒤오", 14);
                    break;
            }
            System.out.println("------------------------------------------------");
        }
    }
}
