package fc.java.part3;

import fc.java.model.CarDAO;
import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

import java.util.Scanner;

public class CarInsertTest {
    public static void main(String[] args) {
        // 자동차 정보를 키보드로 입력 받아서 DB에 저장하세요 - (JDBC)
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

        //DTO 실습
        CarDTO carDTO = new CarDTO () ;
        carDTO.carSn = carSn ;
        carDTO.carOwner = carOwner ;
        carDTO.carPrice = carPrice ;
        carDTO.carType = carType ;
        carDTO.carYear = carYear ;
        carDTO.carName = carName ;

        // DAO 실습
        CarDAO CarDAO = new CarDAO() ;
        CarDAO.CarInsert(carDTO);
        CarDAO.CarSelect(carDTO);

        //CarUtilityTest.carPrint(carDTO); ;

        // Utility 실습
        CarUtility carUtility = new CarUtility();
        carUtility.carPrint(carDTO);

    }
}
