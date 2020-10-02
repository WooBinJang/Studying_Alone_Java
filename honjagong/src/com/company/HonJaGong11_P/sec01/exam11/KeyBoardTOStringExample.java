package com.company.HonJaGong11_P.sec01.exam11;


public class KeyBoardTOStringExample {
    public static void main(String[] args) throws Exception {

        byte[] bytes = new byte[100];
        System.out.println("입력");
        int readByteNo = System.in.read(bytes);

        String str = new String(bytes, 0, readByteNo - 2);
        // -2 를한 이유는 Enter 입력시 \r,\n 이 입력 되기 때문이다 => 수정이 되었는지 -1 를해야한다 \r 또는 \n 이 입력 안되나..?
        System.out.println(str);
    }
}
