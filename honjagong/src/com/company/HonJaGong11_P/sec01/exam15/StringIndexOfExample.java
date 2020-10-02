package com.company.HonJaGong11_P.sec01.exam15;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String str = "자바 프로그래밍";

        if (str.indexOf("자바") != -1) { // .indexOf()에서 문자열이 포함 되지않을 경우 -1 를 리턴함 있다면 첫글자의 인덱스를 리턴함
            System.out.println("자바 포함");
        } else {
            System.out.println("자바 미포함");
        }

        if (str.contains("자바")) { //contains는 문자열에서 특정 문자가 있다면 true 없다면 false를 리턴함
            System.out.println("자바 포함");
        } else {
            System.out.println("자바 미포함");
        }
    }
}
