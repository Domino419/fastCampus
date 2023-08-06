import java.util.Random;
import java.util.Scanner;

public class IfbasicTest {
    public static void main(String[] args) {
        // 교재에서의 초기값
        int x = 10 ;

        // 랜덤으로 숫자 받아와보자
        Random random = new Random();
        x = random.nextInt(100)  ;

        // 콘솔에서 나이를 입력받자 보자
        Scanner scan = new Scanner(System.in) ;
        System.out.println( "나이를 입력하세요 : ");
        x = scan.nextInt() ; // 정수입력
        if (x <= 0){
            System.out.println("입력한 나이를 1세 이상으로 입력하세요"  );
            x = scan.nextInt() ; // 정수입력
        }
        System.out.println(" 입력받은 나이는  : " + x + "세" );
        scan.close(); //

        if (x > 19 ){
            System.out.println("성인입니다 " + x + "세 ");
        }else{
            System.out.println("미성년자입니다 " + x + "세");
        }

    }
}
