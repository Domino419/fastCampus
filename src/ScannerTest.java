import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.println( " 정수를 입력하세요 : ");
        int num = scan.nextInt() ; // 정수입력
        System.out.println(" 입력받은 정수 num : " + num );

        System.out.println( " 실수를 입력하세요 : ");
        float fnum = scan.nextFloat() ; // 실수입력 
        System.out.println(" 입력받은 실수 fnum : " + fnum );

        scan.nextLine(); // 버퍼 비우기 

        System.out.println( " 단어를 입력하세요 : ");
        String word = scan.nextLine() ; // 단어입력
        System.out.println(" 입력받은 단어 word : " + word );


    }
}
