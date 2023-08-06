package fc.java.part2;

public class VDATest {
    public static void main(String[] args) {
        //Q1.정수 한개를 저장하기 위한 변수 선언
        int a = 10 ;

        //Q2.변수 a에 10을 저장하고 , a에 저장된 값을 b에 저장하고 b에 10을 곱하여 C에 저장
        int b = a;
        int c = b * 10 ;
        System.out.println( "b * 10의 값은 ? " + c );

        //Q3.sum이라는 변수에 1부터 5까지의 수를 누적하여 출력
        for (int i = 0; i < 6 ; i++) {
            int sum = 0 ;
            sum = sum + i  ;
            System.out.println( " sum 값은 " + sum );
        }

        //Q4.x=10, y=20을 저장하고 swap 하기 >>  결과값 x=20, y=10
        int x = 10 ;
        int y = 20 ;
        int temp = 0 ; //
        System.out.println( " x의 값은  " + x + "  y의 값은 " + y  + "  temp의 값은 " + temp );

        temp = x ;
        x = y ;  // y에 10이 들어감.
        y = temp ;  //x에는 temp에 있던 x값 10이 들어감.
        temp = 0 ;
        System.out.println( " x의 값은  " + x + "  y의 값은 " + y  + "  temp의 값은 " + temp );

    }
}

// 정수데이터 = int
// 실수 데이터 = float , doble
// 책 데이터 = 객체자료, class를 만들어서 사용
// 영화 데이터  = 객체자료, class를 만들어서 사용
// 문자열 데이터 = String
