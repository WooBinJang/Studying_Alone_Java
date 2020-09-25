package com.company;

public class HonJaGong04 {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1;
        // 주사위 랜덤으로 1~ 6까지 Math.random => 0.0이상 ~ 1.0미만의 double 타입의 난수 값이 랜덤으로 나온다.

        //switch 문
        switch (num) {
            case 1:
                System.out.println("1입니다");
                break;
            case 2:
                System.out.println("2입니다");
                break;
            case 3:
                System.out.println("3입니다");
                break;
            case 4:
                System.out.println("4입니다");
                break;
            case 5:
                System.out.println("5입니다");
                break;
            case 6:
                System.out.println("6입니다");
                break;
        }

        for (int i = 0; ; i++) { //조건식 초기화식 등 생략도 가능하다.
            System.out.println(i);
            if (i == 30)
                break;
        }
        // break문은 가장 가까운 반복문만 종료시킨다. 만약, 바깥쪽 반복문 종료시 라벨을 붙이고 break 라벨; 을 사용해야한다.
        Lable:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i +"  "+j);
                if (i == 3) {
                    break Lable;
                }

            }
        }

        
    }
}
