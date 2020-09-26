package com.company.HonJaGong06_P;
// 싱글톤
public class SingletonExample {
    public static void main(String[] args) {
//        Singleton obj1 = new Singleton();
//        Singleton obj2 = new Singleton();  private 인해 new 연산자로 객체 생성 불가

        Singleton obj1 = Singleton.getInstance(); //싱글톤을 외부 클래스에서 사용하기 위해서는 getInstance() 사용
        Singleton obj2 = Singleton.getInstance(); // 객체를 새로 생성하는것이 아니다.
        if(obj1 == obj2){ //객체 끼리 == 할 경우 번지를 비교
            System.out.println("같은 싱글톤 객체입니다");
        } else
            System.out.println("다른 싱글톤 객체입니다");
    }
}
