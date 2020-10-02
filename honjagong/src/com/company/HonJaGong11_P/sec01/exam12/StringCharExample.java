package com.company.HonJaGong11_P.sec01.exam12;

public class StringCharExample {
    public static void main(String[] args) {
        String ssn = "123456-1234567";
        char a = ssn.charAt(7); // ssn 의 7번째 인덱스의 문자 하나를 추출


        switch(a){
            case '1' :
            case '3' :
                System.out.println("남자");
                break;
            case  '2':
            case  '4':
                System.out.println("여자");
                break;

        }
    }
}
