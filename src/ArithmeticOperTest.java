import java.util.Random;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        //산술 대입연산자를 이해하라.

        int digit = 3625 ;

        Random random = new Random();
        digit = random.nextInt(8999) + 1000 ; // 랜덤으로 받을 숫자를 1000~9999로 지정하고 싶어서..

        int digit1 = digit % 10 ;
        int digit10 = digit / 10 % 10 ;
        int digit100 = digit / 100 % 10;
        int digit1000 = digit / 1000 % 10 ;

        System.out.println( "digit 출력  : "  + digit);

        System.out.println( "digit1000 : "  + digit1000);
        System.out.println( "digit100  : "  + digit100);
        System.out.println( "digit10   : "  + digit10);
        System.out.println( "digit1    : "  + digit1);

        // 홀짝 구분해보기
        String no = digit % 2 == 0 ? "짝수" : "홀수"    ; //2로 나누어 떨어지는 수는 짝수, 아니면 홀수
        System.out.println( " >>> digit는 " + no + "입니다"  );

    }
}
