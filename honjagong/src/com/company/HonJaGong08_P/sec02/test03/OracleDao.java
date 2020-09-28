package com.company.HonJaGong08_P.sec02.test03;

public class OracleDao implements DataAccessObject { //인터페이스를 구현

    @Override
    public void select() {
        System.out.println("Oracle DB 검색");
    } // 인터페이스에 있는 추상 메소드를 재정의 해준다.

    @Override
    public void insert() {
        System.out.println("Oracle DB 삽입");
    }

    @Override
    public void update() {
        System.out.println("Oracle DB 수정");
    }

    @Override
    public void delete() {
        System.out.println("Oracle DB 삭제");
    }
}
