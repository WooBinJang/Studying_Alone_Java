package com.company.HonJaGong11_P.sec01.exam03;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key,String> hashMap = new HashMap<Key,String>();
        //HashMap은 키와벨류 한쌍으로 이루어져있다.
        hashMap.put(new Key(1),"value1");
        hashMap.put(new Key(2),"value2");
        hashMap.put(new Key(1),"value3"); // 키 값이 같다면 그전에 벨류값을 덮어씌운다

        System.out.println(hashMap.size()); // 길이 출력

        HashMap<Member,String> hashMap2 = new HashMap<Member,String>();
        hashMap2.put(new Member("winter"),"value1");
        hashMap2.put(new Member("summer"),"value1");
        hashMap2.put(new Member("winter"),"value1");
        // 같은 winter 라는 키 값을 가지고 있지만 hashMap 같은 경우 (hashCode)번지로 같은 키 값인지 확인 함으로 다른 키 값을 가지고 있다.
        // Member 클래스에서 hashCode를 재정의 해주어 id 값을 hashCode 로 전환하여 리턴 하여 id 값이 같다면 hashCode 값도 같아져 같은 키값을 가지게 된다.
        System.out.println(hashMap2.size());

    }
}
