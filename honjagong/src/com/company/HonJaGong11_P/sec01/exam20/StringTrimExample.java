package com.company.HonJaGong11_P.sec01.exam20;

public class StringTrimExample {
    public static void main(String[] args) {
        String tel1 = "       123";
        String tel2 = "456          ";
        String tel3= "        7890      ";

        String tel = tel1.trim() + tel2.trim() +tel3.trim();
        // 앞또는뒤 공백을 제거 해준다.
        System.out.println(tel);

        String str = "213    123";
        String s = str.trim(); // 문자 와 문자사이에 있는 공백은 trim() 제거 할 수 없다
        System.out.println(s);
    }
}
