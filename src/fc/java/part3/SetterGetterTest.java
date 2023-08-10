package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // setter, getter를 통해 personVo 객체에 값을 저장하고 출력하기
        PersonVO PersonVO = new PersonVO ();
        PersonVO.setName("홍길동");
        PersonVO.setAge(50);
        PersonVO.setPhone("010-1234-1234");
        System.out.println(PersonVO.getName() +"  "+PersonVO.getAge() + "  " + PersonVO.getPhone());
    }
}
