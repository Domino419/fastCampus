package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        // 한사람의 회원 정보를 저장할 객체를 생성하세요 '
        PersonVO PersonVO = new PersonVO();

        // setter, getter 를 사용해서 값을 설정         PersonVO.setAge(10);
        PersonVO.setName("홍길동");
        PersonVO.setPhone("010-1111-1111");
        System.out.println(PersonVO.getAge() + " " + PersonVO.getPhone() + " " + PersonVO.getName());

        // Private 하기 전에 작성한 코드 에러 표시 보기 싫어서 주석처리
        //PersonVO.age=10;
        //PersonVO.name ="홍길동" ;
        //PersonVO.phone = "010-1111-1111" ;
        //System.out.println(PersonVO.age + " " + PersonVO.phone + " " + PersonVO.name);


    }
}
