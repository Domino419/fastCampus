package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        int a  = 0 ;
        int b  = 0;

        a = AllStatic.Random(a) ;
        b = AllStatic.Random(b) ;

        System.out.println(AllStatic.hap(a, b));  // <<--이탤릭체는 atatic에 있는 거
        System.out.println(AllStatic.max(a, b));
        System.out.println(AllStatic.min(a, b));

        // AllStatic AllStatic = new AllStatic() ;  <<--  private라서 new로 생성하면 에러


    }
}
