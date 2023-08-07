package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //Q.자동차의 정보를 키보드로부터 입력 받아서 다른 메서드로 이동 해야 되는 경우를 생각해보자.
        Scanner scan = new Scanner(System.in);
        System.out.println( "자동차 일련번호 : "  );
        int carSn = scan.nextInt() ;

        scan.nextLine()  ;  // 버퍼 비우기
        System.out.println( "자동차 이름  : "  );
        String carName = scan.nextLine() ;

        System.out.println( "자동차 가격  : "  );
        int carPrice = scan.nextInt() ;
        scan.nextLine()  ;  // 버퍼 비우기

        System.out.println( "자동차 소유자 : "  );
        String carOwner = scan.nextLine() ;

        System.out.println( "자동차 년식 : "  );
        int carYear = scan.nextInt() ;

        scan.nextLine()  ;  // 버퍼 비우기
        System.out.println( "자동차 타입 : "  );  //G 휘발류, D경유
        String carType = scan.nextLine() ;

        //System.out.println("<<<<" +  carSn + "\t" +carName + "\t" +  carPrice + "\t" + carOwner + "\t" + carYear  + "\t" + carType  );
        carInfoPrint(carSn,carName , carPrice , carOwner , carYear ,carType ) ;

        CarDTO car = new CarDTO () ;
        car.carSn = carSn ;
        car.carOwner = carOwner ;
        car.carPrice = carPrice ;
        car.carType = carType ;
        car.carYear = carYear ;
        car.carName = carName ;
        carInfoPrint22(car) ;
    }

    //Q.매개변수로 자동차의 정보를 받아서 / 출력하는 / 메서드를 정의해보자.
    public static void carInfoPrint(int carSn, String carName ,int carPrice , String carOwner ,  int carYear ,String carType ) {
        System.out.println("carInfoPrint >>>>" + carSn + "\t" +carName + "\t" +  carPrice + "\t" + carOwner + "\t" + carYear  + "\t" +  carType );
    }
    public static void carInfoPrint22(CarDTO car) {
        System.out.println("carInfoPrint22 >>>>" + car.carSn + "\t" +car.carName + "\t" +  car.carPrice + "\t" + car.carOwner + "\t" + car.carYear  + "\t" +  car.carType );
    }
}
