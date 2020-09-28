package com.company.HonJaGong08_P.sec02.test03;

public class MySqlDao implements DataAccessObject { // 인터페이스 구현
    @Override
    public void select() {
        System.out.println("MySql DB 검색");
    } // 인터페이스에 있는 추상 메소드들을 재정의 해준다.

    @Override
    public void insert() {
        System.out.println("MySql DB 삽입");
    }

    @Override
    public void update() {
        System.out.println("MySql DB 수정");
    }

    @Override
    public void delete() {
        System.out.println("MySql DB 삭제");
    }
}
