package com.company.HonJaGong11_P.sec01.exam17;

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldstr = "자바는 객체지향 언어다. 자바는 많은 API를 가지고 있다.";
        String newstr = oldstr.replace("자바","java");

        System.out.println(oldstr);
        System.out.println(newstr);

        oldstr.replace("자바","JAVA"); // 자바에서 String은 불변의 특성이 있어 변경이 불가하여 새로운 변수에 대입해서 만들어야한다.
        System.out.println(oldstr);
    }
}
