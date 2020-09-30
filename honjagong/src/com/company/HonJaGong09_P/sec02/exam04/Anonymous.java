package com.company.HonJaGong09_P.sec02.exam04;


public class Anonymous {
    private int field;

    public void method(int arg1, int arg2) {
        int var1 = 0;
        int var2 = 0;

//        arg1 =1;
//        arg2 =1; 익명 객체에서 사용되는 매개변수는 final 특성을 가진다

//        var1 =1; // 익명 객체에서 사용되는 로컬변수는 final 특성을 가진다.
//        var2 =1;

        field = 0; // 필드값은 수정이 가능.


        Calculator calculator = new Calculator() {
            @Override
            public int sum() {
                int result = arg1 + arg2 + var1 + var2 + field;
                return 0;
            }
        };
        System.out.println(calculator.sum());
    }
}
