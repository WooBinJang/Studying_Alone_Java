package com.company.HonJaGong07_P.sec01.test05;

public class Parent {
    public String nation;

    public Parent(){
        this("대한민국"); //     public Parent(String nation){ ... } 메소드 실행
//        super();   super() 와 this() 는 같이 쓰일 수 없다.
        System.out.println("Parent() call");
    }
    public Parent(String nation){
//        super(); 부모 생성자는 이 메소드에서 실행 되고 있다.
        this.nation =nation;
        System.out.println("Parent(String nation) call");
    }
}
