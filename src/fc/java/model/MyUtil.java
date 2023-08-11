package fc.java.model;

import java.util.Random;

public class MyUtil {
    public int hap(int a, int b) {
        int v = a+b ;
        return v ;
    }

    //random 숫자 뽑기 메소드 쓰려고 만든 거
    public int Random(){
        Random RandomNO = new Random() ;
        int tempNo = RandomNO.nextInt(100) ;
        System.out.println("랜덤으로 주어진 숫자는 " + tempNo);
        return tempNo ;
    }


}
