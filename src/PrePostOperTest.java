public class PrePostOperTest {
    public static void main(String[] args) {
        //Q. 아래 증감 연산자의 출력문의 결과를 쓰시오

        int a = 10 ;
        a++ ;  //11
        a=a+1 ;  //12
        ++a ;  //13
        System.out.println("a = " + a );

        int b = 10 ;
        b-- ;  // 9
        b=b-1 ;  // 8
        --b ;  //7
        System.out.println("a = " + b);

        int x = 10 ;
        System.out.println("--x = " + --x);
        System.out.println("x++ = " + x++);
        System.out.println("x-- = " + x--);
        System.out.println("++x = " + ++x);
        System.out.println("x   = " + x);

    }
}
