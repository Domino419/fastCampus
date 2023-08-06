import java.util.Random;
import java.util.Scanner;

public class SwithCaseTest {
    public static void main(String[] args) {
        // Swithc 문을 이용해서 요일에 해당하는 운동을 출력하세요
        //운동과 요일을 배열에 담아주기
        String [] act = new String[]  {"야구","농구","수영","휴식","휴식"} ;
        String [] dayOfWeek = new String[]  {"Sun","Mon","Tue","Wed","Fri"} ;

        // 랜덤으로 요일을 받아오자
        Random random = new Random();
        int x = random.nextInt(act.length)  ;
        System.out.println("랜덤함수로 입력받은 요일은 : " + dayOfWeek[x] + "입니다");
        String day =  dayOfWeek[x] ;

        //String day = "Sun" ;  // 강의에서 쓰던 하드 코딩

        switch (day) {
            case  "Sun" :
                System.out.println("야구");
                break;
            case  "Mon" :
                System.out.println("농구");
                break;
            case  "Tue" :
                System.out.println("수영");
                break;
            default:
                System.out.println("휴식");
        }


    }
}
