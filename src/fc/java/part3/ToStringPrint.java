package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        // 생성자와 메서드를 통해 PersonVo 객체에 이름, 나이, 전화번호를 저장하고 toString 메서드로 출력하기
        PersonVO PersonVO = new PersonVO() ;
        System.out.println("--일일이 세팅한 Sout -- "  + PersonVO.getName() + "\t" + PersonVO.getAge() + "\t" + PersonVO.getPhone());
        System.out.println("--toString 메소드   -- " + PersonVO.toString());
        System.out.println("--Sout  메소드   ----- " +  PersonVO);
    }
}
