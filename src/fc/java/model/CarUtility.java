package fc.java.model;

public class CarUtility {
    public void carPrint(CarDTO CarDTO) {
        //매개변수로 자동차의 정보를 입력 받아서 출력하는 메소드 작성
        System.out.println("car 정보를 출력합시다.");
        System.out.println("carPrint >>>> " + CarDTO.carSn + "\t" +CarDTO.carName + "\t" +  CarDTO.carPrice + "\t" + CarDTO.carOwner + "\t" + CarDTO.carYear  + "\t" +  CarDTO.carType );
    }
}
