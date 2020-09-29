package com.company.HonJaGong09_P.sec01.exam02;

public class A {
    class B {
    } // 중첩 클래스(인스턴스 멤버 클래스)

    static class C {
    } // 중첩 클래스(정적 멤버 클래스)

    B field1 = new B();
    C field2 = new C();

    void method1() {
        B var1 = new B();
        C var2 = new C();
    }

    //    static B field3 = new B(); field3 앞에 static 이 있어 A 객체 없이 사용이 가능하다는 의미 인데  B객체는 인스턴스 클래스 이므로 X
    static C field4 = new C(); // C 객체 같은 경우 정적 멤버 클래스 이므로 사용 O

    static void method2() {
//        B var3 = new B(); method2 같은 경우 정적 메소드 이므로 A 객체 없이 사용 가능하지만 B 객체는 A객체 없이 사용이 불가능하다  
        C var4 = new C();  // C 객체는 정적 멤버 클래스이므로 A 객체 없이 사용 가능 
    }
}
