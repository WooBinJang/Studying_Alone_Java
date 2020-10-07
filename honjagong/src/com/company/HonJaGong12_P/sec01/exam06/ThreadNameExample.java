package com.company.HonJaGong12_P.sec01.exam06;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기
                System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName()); //getName()으로 스레드 이름 확인

        Thread threadA = new ThreadA();
        System.out.println("작업 스레드 이름: " + threadA.getName()); //setName()으로 설정 시 이름 설정 가능
        threadA.start();

        Thread threadB= new ThreadB();
        System.out.println("작업 스레드 이름: " + threadB.getName()); // 작업 스레드 초기값은 Thread-n
        threadB.start();
    }
}
