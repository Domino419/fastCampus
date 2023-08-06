package fc.java.part2;

import java.util.Random;

public class MaxMinValue {
    public static void main(String[] args) {
        // 삼항연산자 실습  , 조건문 ? 참 : 거짓
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        System.out.println( " a = " + a + " b = " + b );

        // min value
        int min = (a< b) ? a : b ;
        System.out.println( "min = " + min );

        // max value
        int max = (a > b) ? a : b ;
        System.out.println( "max = " + max );

    }
}
