package fc.java.part2;

public class FindAPI {
    public static void main(String[] args) {
        int a ; // 변수 선언 = 자료형 + 변수명
        test() ;
        a=10 ;
        System.out.println("a = " + a);

        java.lang.String s ;
        s = "APPLE" ;
        System.out.println("s = " + s );
        System.out.println("s.toLowerCase()= " + s.toLowerCase() );
        System.out.println("s.length()= " + s.length() );
        test() ;
    }

    private static void test() {
        System.out.println("파닥파닥");
        int test = 15 ;
        String test2 = test > 0   ?   "참" :  "거짓" ;
        System.out.println( test2 );
        char Unicode1 = 65 ; //A
        char Unicode2 = 44032 ;  //가
        System.out.println(Unicode1 );
        System.out.println(Unicode2 );
    }
}

// 기본 자료형(PDT)의 종류 이해.
// 1bit = 0.1을 저장하는 최소의 단위
// 8bit = 1byte