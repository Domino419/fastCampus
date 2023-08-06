package fc.java.part2;

import java.util.Random;

public class ApiOverloading {
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println();
        System.out.println(10);
        System.out.println(10.5f);
        System.out.println('A');
        System.out.println("APPLE");

        int a =  random.nextInt(100);
        int b =  random.nextInt(100);
        System.out.println( "a값은 " + a + "    b값은 " + b);
       //  int max=maxValue(7,9);
        int max=maxValue(a , b) ;
        System.out.println(">>>> maxValue, >>  " + max); // 9

        int min=minValue(a , b) ;
        System.out.println(">>>> minValue >> " + min); // 3

    }
    // Q. 더 큰 수를 리턴
    public static int maxValue(int a, int b){
        System.out.println(">>>> minValue 메소드 시작 " + a + "," + b); // 3
        return (a>b) ? a : b;
    }
    // Q. 더 작은 수를 리턴
    public static int minValue(int a, int b){
        System.out.println(">>>> minValue 메소드 시작 "  + a + "," + b); //
        return (a<b) ? a : b;
    }

}

// API에서 제공되는 오버로딩 메서드를 사용하는 실습 파일
//메서드는 클래스 내에서 독립적으로 만들어야 한다 (하나의 단위를 처리해야함)

