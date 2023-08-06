package fc.java.part2;

import java.util.Random;
import java.util.Scanner;

public class IfelseTest {
    public static void main(String[] args) {
        // 콘솔에서 숫자를 입력받자.
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        // int x = scan.nextInt(); // 정수입력
        //System.out.println("입력받은 숫자는  : " + x + "입니다");

        // 랜덤으로 숫자 받아오자. 콘솔 입력 귀찮아.
        Random random = new Random();
        int x = random.nextInt(999) + 1000  ;
        System.out.println("입력받은 숫자는  : " + x + "입니다");

        noChk(x);  // 음수양수 체크
        noChk2(x);  // 홀수짝수 체크
        noChk3(x);  // 윤년을 체크하자
    }

    public static void noChk(int x) {
        if (x >= 0) {
            System.out.println(" >> 0 or 양수입니다.");
        } else {
            System.out.println(" >> 음수입니다.");
        }
    }

    public static void noChk2(int x) {
        if (x % 2 == 0 ) {
            System.out.println("--->> 짝수입니다.");
        } else {
            System.out.println("--->> 홀수입니다.");
        }
    }

    public static void noChk3(int x) {
        // x=2020 ;  윤년 테스트용 2020, 2024 ...
        // 4의 배수 && 100으로 나누어 떨어지지 않거나, 400의 배수여야함
        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            System.out.println("--->> 윤년입니다.");
        } else {
            System.out.println("--->> 윤년이 아닙니다");
        }
    }


}

