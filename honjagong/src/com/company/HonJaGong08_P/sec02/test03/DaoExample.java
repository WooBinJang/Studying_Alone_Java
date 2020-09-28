package com.company.HonJaGong08_P.sec02.test03;

public class DaoExample {
    public  static  void dbWork(DataAccessObject dao){ // 인터페이스는 매개변수로도 받을 수 있으며

        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) { //실행 클레스
        OracleDao oracleDao = new OracleDao();
        dbWork(oracleDao); // 객체를 생성 한 후 변수에 넣어 줄 수도 있다.
        dbWork(new MySqlDao()); // 인터페이스를 구현한 구현 클래스들은 자동 형변환 되어 대입 할 수있다.

    }
}
