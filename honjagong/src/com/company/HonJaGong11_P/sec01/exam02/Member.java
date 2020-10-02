package com.company.HonJaGong11_P.sec01.exam02;

public class Member {
    public String id;

    public Member(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) { // equals 재정의
        if (object instanceof Member) { // 매개값이 object 타입이므로 모든 객체가 들어 갈수 있으므로 instanceof 타입 확인
            Member member = (Member) object;
            if(id.equals(member.id)){ // 필드 id 값을 비교하는것으로 메소드를 재정의 해줌
                return true;
            }
        }
            return false;
    }
}
