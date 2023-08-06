public class WhileLoopTest {
    public static void main(String[] args) {
        int i = 0 ;
        while (i<= 5) {  //조건식 주기
            System.out.println("i는 " + i);
            i++;
        }

        // 배열의 모든 원소를 출력하시오
        int []  numbers = {1,2,3,4,4,5,6,7,8,9,10} ;
        i = 0 ;
        while (i < numbers.length) {
            System.out.println( numbers[i]);
            i++ ;
        }

        //1~10까지 출력하는 프로그램을 while과 do~while로 작성하기
        int ii = 0 ;
        while (ii<= 10) {  //조건식 주기
            System.out.println("while로 작성한 프로그램 " + ii);
            ii++;
        }

        // Do while 로 작성하기
        int iii = 1 ;
        do {
            System.out.println("do while로 작성한 프로그램 " + iii);
            iii++ ;
        }while (iii<=5) ;
    }
}



