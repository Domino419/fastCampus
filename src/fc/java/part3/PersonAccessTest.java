package fc.java.part3;

import fc.java.model.PersonDTO;

public class PersonAccessTest {
    public static void main(String[] args) {
        // Q.Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요
        PersonDTO PersonDTO = new PersonDTO () ;
        PersonDTO.name ="홍길동" ;
        PersonDTO.age = 1000 ;
        PersonDTO.phone = "010-1234-111" ;

        System.out.println(PersonDTO.name + PersonDTO.phone + PersonDTO.age);
        PersonDTO.walk() ;
        PersonDTO.eat(); ;
        PersonDTO.play(); ;


    }
}

// 객체 상호 간에 접근을 제어하는 방법 (접근제어자 사용)

// public = 모든 패키지에서 접근 가능
// private = 모든 패키지에서 접근 불가 , 자기 자신만 접근 가능
// protected = 상속 관계에서 하위 클래스에서 상위 클래스 접근 가능
// default = 동일한 패키지에서만 접근 가능 (접근제어자가 존재하지 않음)
