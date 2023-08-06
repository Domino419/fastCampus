public class BreakContinueTest {
    public static void main(String[] args) {
        //. char[ ] c={‘s’,’h’,’u’,’t’,’d’,’o’,’w’,’n’}; 위 배열의 값을 출력 중 o ’라는 문자를 만나면 반복을 중지 하세요
        char[] c = {'s', 'h', 'u', 't', 'd', 'o', 'w', 'n'};
        for (char su : c) {
            if (su != 'o') {
                System.out.print(su);
            } else {
                break;
            }
        }
        System.out.println();

        // 1~10까지의 수 중 3의 배수를 구하여 출력하세요
        for (int i = 1 ; i <= 10  ; i++) {
            int sum = 0 ;
            if(i%3 == 0 ){
                sum ++ ;
                System.out.println( i );
            }
        }
        System.out.println( "for문 종료~!");


    }
}
