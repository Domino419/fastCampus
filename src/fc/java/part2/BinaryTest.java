package fc.java.part2;

public class BinaryTest {
    public static void main(String[] args) {
        // 수의 진법 이해하기
        int a = 10 ;
        float f = 35.6f ;
        boolean b =false ;
        char c= 'A' ;
        String s = "APPLE" ;

        //Q1. 69를 10진수, 2진수, 8진수, 16진수로 출력하기
        int demcimal = 69;
        System.out.println("demcimal" + demcimal);
        int binary = 0b1000101 ;
        System.out.println("binary" + binary);
        int octal = 0105 ;
        System.out.println("octal" + octal);
        int hexa = 0x45 ;
        System.out.println("hexa" + hexa );

    }
}
