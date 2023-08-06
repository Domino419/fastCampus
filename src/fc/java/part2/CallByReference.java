package fc.java.part2;

import java.util.Random;

public class CallByReference {
    public static void main(String[] args) {
      //Q. 매개변수로 정수형 배열을 받아서 배열의 총합을 구하여 리턴 하는 메서드를 정의 하세요
        Random random = new Random();
        int a = random.nextInt(10)  ;
        int b = random.nextInt(10)  ;

        System.out.println("a =" + a + "      b= " + b);

        add(a,b)  ;
        System.out.println("add(a,b) =" + add(a,b));


    }
    // Call by value (값을 전달하기)
 public static int add(int a , int b ){
        int sum = a+b ;
        return sum ;
 }


}
