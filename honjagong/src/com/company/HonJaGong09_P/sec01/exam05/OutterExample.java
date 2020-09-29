package com.company.HonJaGong09_P.sec01.exam05;

public class OutterExample extends Outter {
    public static void main(String[] args) {
        Outter outter = new Outter();
        Outter.Nested nested = outter.new Nested();

        nested.print();

    }
}
