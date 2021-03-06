package com.company.HonJaGong10_P.sec02.exam03;

public class CatchByExceptionKindExample {
    public static void main(String[] args) {
        String[] arg = {"10"};
        String data1 = null;
        String data2 = null;

        try {
            data1 = arg[0];
            data2 = arg[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch (ArrayIndexOutOfBoundsException e) { //Exception 과 예외코드를 ArrayIndexOutOfBoundsException의 차이는
            // Exception 모든 예외를 처리하고 ArrayIndexOutOfBoundsException의 코드는 ArrayIndexOutOfBoundsException예외 일때만 실행된다
            System.out.println("실행 매개값이 부족");
        } catch (NumberFormatException e){ //Exception 는 맨마지막에 써야한다
            System.out.println("숫자로 변환 x");
        }
        finally {
            System.out.println("다시 실행"); //항상 실행
        }
    }
}
