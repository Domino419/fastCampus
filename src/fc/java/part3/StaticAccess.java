package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {

        // NoneStaticTest에 만들어놨던 랜덤숫자 메소드 쓰고 싶어서 객체 생성
        MyUtil MyUtil = new MyUtil() ;
        int a = MyUtil.Random() ;
        int b = MyUtil.Random() ;

        int sum = MyUtil.hap(a, b) ;
        System.out.println( "두 숫자의 합은  "  + sum );

    }
}
