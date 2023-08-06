package fc.java.part2;

public class CarTest {
    public static void main(String[] args) {
        // 자동차의 정보를 저장하는 변수 만들기
        String model  = "BMW528i";
        long distance = 100000 ; //8byte 정수
        int price = 900000000 ; //4byte 정수
        String company = "BMW";
        char type = 'A' ; //2byte 문자
        boolean auto = true;
        int year = 2010 ;  //4byte 정수
        float gasmi = 12.5F;  //4byte 실수 0.0f

        System.out.println("model = " + model );
        System.out.println("distance = " + distance );
        System.out.println("price = " + price );
        System.out.println("company = " + company );
        System.out.println("type = " + type );
        System.out.println("auto = " + auto );
        System.out.println("year = " + year );
        System.out.println("gasmi = " + gasmi );


    }
}

