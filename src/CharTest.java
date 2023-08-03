public class CharTest {
    public static void main(String[] args) {
        System.out.println("---CharTest ---");
        //Q1.'가'라는 한글 한 문자를 변수에 저장하고 출력하기
        char Q1 = 44032 ;
        System.out.println( "'가'라는 한글 한 문자를 변수에 저장하고 출력하기 :  " +Q1 +"\n");

        //Q2. 대문자 'A'를 문자'a'로 변환하여 출력하기
        char Q2 = 65 ;
        char Q22 = (char) (Q2 + 32);
        System.out.println("대문자 'A'를 문자'a'로 변환하여 출력하기 : " + Q22 +"\n" );  // 소문자 a = 97, 97-65= 32

        //Q3. '1' + '2' = 3이 나오도록 하기
        char NO1 =1 ;
        char NO2= 2 ;
        System.out.println("'1' + '2' = 3이 나오도록 하기: " +(NO1 + NO2 )+"\n");

        //Q4. '1'+'2'+'3'+'4'
        char NO3 = 3 ;
        char NO4 = 4 ;
        char NO5 = 5 ;
        System.out.println( "'1'+'2'+'3'+'4'+'5' = 15가 나오도록 하기 : " + (NO1+ NO2 + NO3 + NO4 + NO5) +"\n");

        }

    }

