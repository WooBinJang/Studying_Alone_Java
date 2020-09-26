package com.company.HonJaGong06_P;
// 인스턴스final
public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person("123456-1234567","홍길동");
        System.out.println(person.nation);
        System.out.println(person.name);
        System.out.println(person.ssn);

//        person.nation = "USA";  final 필드 이므로 변경 불가
//        person.ssn = "654321-7654321"; ssn 또한 final이므로 한번 값이 입력 되면 변경이 불가능하다.
        person.name = "이순신"; // final이 아니므로 변경 가능.



    }
}
