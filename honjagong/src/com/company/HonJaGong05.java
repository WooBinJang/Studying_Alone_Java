package com.company;

public class HonJaGong05 {
    public static void main(String[] args) {
        String name = new String("장우빈"); // 새로운 String 객체 생성
        String name2 = new String("장우빈");
        String name3 = "장우빈";// name3 과 name4가 같은 번지의 같은객체를 참조
        String name4 = "장우빈";
        System.out.println(name == name2); // 번지 비교
        System.out.println(name.equals(name2)); // .equals => 문자열 비교
        System.out.println(name3 == name4);
        System.out.println(name == name3);

        System.out.println("-----------------------------------------------");

        String[] arr = new String[3];
        arr[0] = "java";
        arr[1] = "java";
        arr[2] = new String("java");
        System.out.println(arr[0] == arr[1]);
        System.out.println(arr[0]==arr[2]); // 다른 객체를 참조

        System.out.println("-----------------------------------------------");

        //배열 복사
        String [] oldStrArray = {"java","array","copy"};
        String [] newStrArray = new String[5];
        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);
        // 원본배열 , 인덱스(원본배열) , 대상배열 , 인데스(대상배열) , 몇개
        newStrArray[3] = "Wow";
        newStrArray[4] = "Wow";
        for(int i=0 ; i< newStrArray.length; i++){
            System.out.println(newStrArray[i]);
        }

        System.out.println("-----------------------------------------------");

        // 향상된 for 문
        int [] scores = {12,34,72,45,75,45,47};
        int sum =0;
        for(int score : scores){ // 배열의 요소 만큼 반복하고 끝남
            sum += score;
        }
        System.out.println(sum);
    }
}
