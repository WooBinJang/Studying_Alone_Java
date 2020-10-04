package com.company.HonJaGong11_P.sec02.exam02;

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        //Calendar 는 추상클래스이므로 new 연산자로 객체생성이 불가능하다.

        int year = now.get(Calendar.YEAR);
        System.out.println(year + "년");
        int month = now.get(Calendar.MONTH) + 1;
        //  MONTH는 0~11 까지 리턴함으로 +1를 해주어야 한다
        System.out.println(month + "월");
        int day = now.get(Calendar.DAY_OF_MONTH);
        System.out.println(day + "일");
        int week = now.get(Calendar.DAY_OF_WEEK);
        String strweek = null;
        switch (week) {
            case Calendar.MONDAY:
                strweek = "월";
            case Calendar.TUESDAY:
                strweek = "화";
            case Calendar.WEDNESDAY:
                strweek = "수";
            case Calendar.THURSDAY:
                strweek = "목";
            case Calendar.FRIDAY:
                strweek = "금";
            case Calendar.SATURDAY:
                strweek = "토";
            case Calendar.SUNDAY:
                strweek = "일";
        }
        System.out.println(strweek + "요일");

        int ampm = now.get(Calendar.AM_PM);
        if(ampm == Calendar.AM){
            System.out.println("오전");
        }else {
            System.out.println("오후");
        }

    }
}
