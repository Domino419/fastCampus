public class ForLoopTest {
    public static void main(String[] args) {
        // 반복문을 이용해서 알파벳 대문자와 아스키 코드값으로 출력하기
        System.out.println("test1 시작 지점---------------------- ");
        //test1() ;
        System.out.println("test2 시작 지점---------------------- ");
        //test2(); ;
        System.out.println("test3 시작 지점---------------------- ");
        // test3(); ;
        System.out.println("test4 시작 지점---------------------- ");
        // test4(); ;
        System.out.println("test5 시작 지점---------------------- ");
        test5(); ;


    }

    // 셀프 풀이
    public static void test1 (){
        for (int i = 0; i < 10 ; i++) {
        // System.out.println("i값은 " +  i );
        char Q = (char) (65  + (char) i);
        System.out.println( i  + "번째의 출력값은  " +  Q );
        }
    }
    //교재 풀이 따라하기
    public static void test2 (){
        for (char c ='A' ; c <= 'z' ; c++) {
            System.out.println( c + " : " +  (int) c );
        }
    }

    public static void test3 (){
        for (char C ='a' ; C <= 'z' ; C++) {
            System.out.println( C + " : " + (int)  C );
        }
    }

    public static void test4 (){
        for (int i = 65  ; i <= 90  ; i++) {
            System.out.println( (char) i  + " : " + i  );
        }
    }

    // 배열 원소를 향상된 for문으로 출력하기
    public static void test5 (){
        int [] numbers = {1,2,3,4,5,6,7,8,9,10} ;
        for (int i = 0  ; i < numbers.length  ; i++) {
            System.out.println( "for문을 사용한 numbers[" + i + "] :  " +  numbers[i] );
        }
        for (int su : numbers )
        System.out.println( "향상된 for문을 사용한 nambers :  " +  su  );
    }



}
