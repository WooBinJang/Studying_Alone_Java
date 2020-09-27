package com.company.HonJaGong07_P.sec01.exam01;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbcellPhone dmbcellPhone = new DmbcellPhone("자바폰","검정", 10);

        System.out.println(dmbcellPhone.color);
        System.out.println(dmbcellPhone.model); // cellphone 부모클래스에서 상속받은 model, color 필드를 자식클래스에서 사용가능하다
        System.out.println(dmbcellPhone.channel);

        dmbcellPhone.powerOn();
        dmbcellPhone.bell(); // 메소드 역시 상속받은 자식클래스에서 사용이 가능하다.
    }
}
