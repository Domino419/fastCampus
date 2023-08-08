package fc.java.model;

public class CarDAO {
    public void CarInsert(CarDTO car) {
        //DB 연결, insert SQL
        System.out.println("car 정보가 DB에 저장되었습니다");
        System.out.println("CarInsert >>>>" + car.carSn + "\t" +car.carName + "\t" +  car.carPrice + "\t" + car.carOwner + "\t" + car.carYear  + "\t" +  car.carType );
    }

    public void CarSelect(CarDTO car) {
        //DB 연결, insert SQL
        System.out.println("car 정보가 출력 되었습니다");
        System.out.println("CarSelect >>>>" + car.carSn + "\t" +car.carName + "\t" +  car.carPrice + "\t" + car.carOwner + "\t" + car.carYear  + "\t" +  car.carType );
    }

    public void CarDelete(CarDTO car) {
        //DB 연결, insert SQL
        System.out.println("car 정보가 DB에서 삭제 되었습니다.");
        System.out.println("CarDelete >>>>" + car.carSn + "\t" +car.carName + "\t" +  car.carPrice + "\t" + car.carOwner + "\t" + car.carYear  + "\t" +  car.carType );
    }

}

// Ch2. 우리가 만들어보는 클래스의 종류

// 우리가 만들어보는 클래스(모델)의 종류

// ㅇ 모델(Model) 이란 무엇인가
// 객체_Object (현실적) 클래스_class(프로그래밍적) = 모델_Model(소프트웨어 공학적)
// 객체 지향 프로그래밍에서 클래스를 역할에 따라 부르는 이름을 모델(Model) 이라고 부른다.
// 역할에 따라서 다양한 모델을 만들어 사용할 수 있다.
// 시작클래스(모델) ,
// DTO, Vo, Model (데이터를 담는 모델=Data Transfer Object, Value Object ) ,
// DAO model (데이터를 처리하는 모델 = Data Access object )
// Utility (Helper Object)


// ㅇ DTO,  Vo 클래스가 왜 필요할까.
// 데이터를 하나로 묶어야 될 경우 바구니가 필요 , 데이터를 하나로 수집하는 역할

// ㅇ DAO(Data Access Object)  클래스의 필요이유
// CRUD 동작을 가지고 있는 클래스, 비즈니스 로직을 처리하는 클래스
// 데이터베이스에 데이터를 저장, 수정 하거나 검색, 삭제를 하기 위해서 만들어지는 모델(클래스)

// Utility 클래스의 필요 이유
//반복적으로 사용해야 될 동작(기능)을 별도의 클래스로 만들어 놓고, 필요할 때 사용하는 클래스
// 꼭 필요한 것을 아니고, 필요하면 만들어서 사용 하는 것
//자바에서도 java.until 패키지에 Utility 클래스가 만이 있음. (Utility, Helper, facade 등...)
// 날짜, 통화, 시간 정보 획득 , 인코딩 기능, DAO 이외의 별도 기능(동작)
