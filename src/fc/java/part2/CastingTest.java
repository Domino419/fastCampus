package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        float f1 = .10f ; //0.10
        System.out.println("f1 =" + f1) ;
        float f2 = 15f  ;// 15.0
        System.out.println("f2 =" + f2) ;
        float f3 = 3.14f  ;// 15.0
        System.out.println("f3 =" + f3) ;

        double d1 = 123.4567 ;
        System.out.println("d1 = " + d1);

        float x = 15.6f ;
        int y = (int) x;  //강제 형변환 (손실 발생)
        System.out.println( "y 는 " + y );

        char c = 'A' ;
        int cc = c ;  // 자동 형변환
        System.out.println("c는 " + cc );
        int ccc = (int) c ; //강제 형변환
        System.out.println("ccc는 " + ccc );

        int dd = 5 ;
        double ddd = dd ; // 자동형변환
        System.out.println("ddd는 " + ddd );
        
        double dx = 14.67 ;
        int dy = (int) dx;    //강제형변환
        System.out.println("dy는 " + dy);
    }
}

// 자료형은 분류할 때 크게 2가지로 분류한다 - 기본자료형, 사용자정의자료형
//문자별을 저장하기 위해서 자바에서 만들어서 제공해주는 API는 String
// 기본자료형 중 정수자료형의 default는 int, 실수형의 default 는 flaot
// 7 bit로 이루어진 영문 알파벳을 수치형으로 만들어 놓은 문자 인코딩은 아스키코드
// 전세계 비영어권의 모든 문자를 수치형으로 만들어 놓은 문자 인코딩은 유니코드
//변수의 타입을 다른 타입으로 변환하는 것은 형변환
