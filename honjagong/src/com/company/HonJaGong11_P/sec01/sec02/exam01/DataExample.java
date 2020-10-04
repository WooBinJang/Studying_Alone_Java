package com.company.HonJaGong11_P.sec02.exam01;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataExample {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일 hh시 mm분 ss초"); // 패턴 설정
        String s =sdf.format(now);
        System.out.println(s);

    }
}
