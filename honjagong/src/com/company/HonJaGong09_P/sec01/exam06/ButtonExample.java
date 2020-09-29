package com.company.HonJaGong09_P.sec01.exam06;

public class ButtonExample {
    public static void main(String[] args) {
        Button button1 = new Button();
        button1.setListener(new CallListener());
        button1.click();
        button1.setListener(new MassageListener());
        button1.click();
    }
}
