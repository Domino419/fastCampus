import java.util.Random;

public class RelationOperTest {
    public static void main(String[] args) {
        // 관계, 논리 연산자를 이해하라

        int a = 4 ;

        Random random = new Random();
        a = random.nextInt(99) + 100 ;

        System.out.println( "a의 값은 ? " + a  );  // false
        System.out.println( "a  > 5 = " + (a > 5 ) );  // false
        System.out.println( "a  < 5 = " + (a < 5 ) );  // true
        System.out.println( "a == 6 = " + (a == 6) );  // false
        System.out.println( "a != 4 = " + (a != 4 ) );   // false
        System.out.println( "3 >= a = "  + (3 >= a ) );   // false
        System.out.println( "a <=a+1=" + (a <= a+ 1) );  //true

    }
}
