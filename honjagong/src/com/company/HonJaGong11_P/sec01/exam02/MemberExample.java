package com.company.HonJaGong11_P.sec01.exam02;

public class MemberExample {
    public static void main(String[] args) {
        Member member1 = new Member("jang");
        Member member2 = new Member("jang");
        Member member3 = new Member("jung");

        if(member1.equals(member2)){ // 번지가 아닌 필드 값 비교로 메소드를 재정의해줌
            System.out.println("동등하다");
        }else {
            System.out.println("동등하지않다");
        }

        if(member1.equals(member3)){ // 번지가 아닌 필드 값 비교로 메소드를 재정의해줌
            System.out.println("동등하다");
        }else {
            System.out.println("동등하지않다");
        }
    }
}
