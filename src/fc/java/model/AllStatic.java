package fc.java.model;

import java.util.Random;

public class AllStatic {

    private AllStatic() { }

    public static int hap (int a, int b){
        int v = a+ b ;
        return v ;
    }

    public static int max(int a, int b) {
        return a>b ? a : b ;
    }


    public static int min(int a, int b) {
        return a<b ? a : b ;
    }

    public static int Random(int tempNo){
        Random RandomNO = new Random() ;
        tempNo = RandomNO.nextInt(100) ;
        System.out.println("랜덤으로 주어진 숫자는 " + tempNo);
        return tempNo ;
    }

}
