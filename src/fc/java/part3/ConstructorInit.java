package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        // 생성자 메서드를 통해 personVo 이름 나이 전화번호를 저장하고 출력하기
        PersonVO PersonVO= new PersonVO() ;
        System.out.println( PersonVO.getName() + "" + PersonVO.getPhone() + " " + PersonVO.getAge());

        PersonVO PersonVO1= new PersonVO() ;
        System.out.println( PersonVO1.getName() + "" + PersonVO1.getPhone() + " " + PersonVO1.getAge());

        //개발자가 원하는 방법으로 초기화 하는 방법 > 생성자 메서드를 오버로딩해서 가능


    }
}
