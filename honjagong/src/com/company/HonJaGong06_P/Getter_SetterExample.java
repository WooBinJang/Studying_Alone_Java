package com.company.HonJaGong06_P;

public class Getter_SetterExample {
    public static void main(String[] args) {
        Getter_Setter getter_setter = new Getter_Setter();
        getter_setter.setSpeed(50);
        System.out.println(getter_setter.getSpeed());

        if(!getter_setter.isStop()){
            getter_setter.setStop(true);
        }
        System.out.println(getter_setter.getSpeed());
    }
}
