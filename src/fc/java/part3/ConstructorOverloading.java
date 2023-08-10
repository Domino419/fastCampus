package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 PersonVo에 원하는 이름, 나이 , 전화번호를 저장하고 출력하기.
        PersonVO PersonVO =new PersonVO() ;
        PersonVO PersonVO1 = new PersonVO("나길동",10,"010-1234-1234") ;
        PersonVO PersonVO2 = new PersonVO("조길동",20,"010-1234-5647") ;

        System.out.println(PersonVO.getName() + PersonVO.getPhone() + PersonVO.getAge());
        System.out.println(PersonVO1.getName() + PersonVO1.getPhone() + PersonVO1.getAge());
        System.out.println(PersonVO2.getName() + PersonVO2.getPhone() + PersonVO2.getAge());
    }
}
