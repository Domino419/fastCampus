package fc.java.part2;

import java.util.Random;

public class IfElseIfTest {
    public static void main(String[] args) {
        // 랜덤으로 학생 성적을 받아오자
        Random random = new Random();
        int jumsu = random.nextInt(101)   ;   //만점은 100점
        System.out.println("입력된 점수는   : " + jumsu + "입니다");

        // 90 이상이면 A, 85 이상이며 B, 그 외에는 C반, 80점 미만이면 불합격
        if(jumsu>=0 && jumsu<=100 ) { //점수가 0~ 100 사이인지 체크
            if (jumsu >= 90) {
                System.out.println("A반");
            } else if (jumsu >= 85) {
                System.out.println("B반");
            } else if (jumsu >= 80 ){
                System.out.println("C반");
            } else {
                System.out.println("불합격");
            }
        }else{
            System.out.println("유효한 점수가 아닙니다");
        }

    }
}
