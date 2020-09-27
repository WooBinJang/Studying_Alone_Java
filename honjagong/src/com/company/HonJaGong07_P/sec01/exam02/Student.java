package com.company.HonJaGong07_P.sec01.exam02;

public class Student extends Peolpe  {
    //필드
    public  int studentNo;
    //생성자
    Student (String name , String ssn, int studentNo) {
            super(name, ssn); // 부모 클래스에 생성자에 매개변수가 있다면 그에 맞는 자식 개체에서 매개 변수를 명시 해주어야만 한다.
        this.studentNo = studentNo;
    }
    //메소드
}
