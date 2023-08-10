package fc.java.part3;

import java.util.Random;

public class NoneStaticTest {
    public static void main(String[] args) {
        //static에 없는 메소드를 호출하기 위해서 객체를 생성 , heap Area에 생성됨.
        NoneStaticTest st = new NoneStaticTest () ;
        int a = 0 ;
        int b = 0 ;
        a = st.Random(a) ;
        b = st.Random(b) ;

        int sum = st.hap (a, b) ;
        System.out.println(sum);
    }

    public int hap (int a , int b) {
        int v = a+b ;
        return v ;
    }

    public int Random(int tempNo){
        Random RandomNO = new Random() ;
        tempNo = RandomNO.nextInt(100) ;
        System.out.println("랜덤으로 주어진 숫자는 " + tempNo);
        return tempNo ;
    }
}
