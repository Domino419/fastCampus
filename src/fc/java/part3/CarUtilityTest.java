package fc.java.part3;
import fc.java.model.CarDAO;
import fc.java.model.CarDTO;


public class CarUtilityTest {
    public static void main(String[] args) {
        // Car 정보를 출력하는 동작을 가지고 있는 유틸리티 클래스를 설계하기
       int carSn  = 1110 ;
       String carName  = "BMW500" ;
       int carPrice = 10000 ;
       String carOwner  ="홍길동" ;
       int carYear = 2023 ;
       String carType ="G" ;

       CarDTO CarDTO = new CarDTO() ;
       CarDTO.carYear=carYear ;
       CarDTO.carType=carType ;
       CarDTO.carPrice=carPrice ;
       CarDTO.carOwner=carOwner ;
       CarDTO.carName=carName ;
       CarDTO.carSn=carSn ;

        carPrintTest(CarDTO) ;

    }
    public static void carPrintTest(CarDTO CarDTO) {
      //매개변수로 자동차의 정보를 입력 받아서 출력하는 메소드 작성
        System.out.println("car 정보를 출력합시다.");
        System.out.println("carPrint >>>> " + CarDTO.carSn + "\t" +CarDTO.carName + "\t" +  CarDTO.carPrice + "\t" + CarDTO.carOwner + "\t" + CarDTO.carYear  + "\t" +  CarDTO.carType );
    }
}
