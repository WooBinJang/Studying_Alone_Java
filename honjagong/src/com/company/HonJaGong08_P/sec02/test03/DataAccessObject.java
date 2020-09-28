package com.company.HonJaGong08_P.sec02.test03;

public interface DataAccessObject { //인터페이스
    void select(); //추상 메소드 : {} -> x 실행 블록이 없어 메소드 선언만 하고 구현 클래스에서 메소드 재정의를 해줘어야 함

    void  insert(); // 인터페이스라서 (public) abstract  생략하더라도 추상 메소드가 된다.

    void  update(); // 인터페이스는 타입 default 갑이 public 이다.

    void  delete();

}
