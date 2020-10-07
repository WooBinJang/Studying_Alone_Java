package com.company.HonJaGong12_P.sec01.exam07;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) { // 계산기 메모리에 값을 저장하는 메소드
        this.memory = memory; // 매개갑을 memory 필드에 저장
        try {
            Thread.sleep(2000); //스레드를 2초가 일시 정지
        } catch (InterruptedException e) { }
            System.out.println(Thread.currentThread().getName() + ": " + this.memory); //스레드 이름 얻기   + 메모리 값

    }
}
