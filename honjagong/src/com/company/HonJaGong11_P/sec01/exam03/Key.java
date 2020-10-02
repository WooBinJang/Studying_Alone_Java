package com.company.HonJaGong11_P.sec01.exam03;

public class Key {
    int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) { //equals() 재정의
        if (obj instanceof Key) { //타입 비교
            Key key = (Key) obj; //강제 형 변환
            if (this.number == key.number) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() { // hashCode() 재정의
        return number;
    }
}
