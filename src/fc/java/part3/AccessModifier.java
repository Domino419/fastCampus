package fc.java.part3;

import fc.java.model.MemberDTO;

public class AccessModifier {
    public static void main(String[] args) {
        MemberDTO MemberDTO = new MemberDTO () ;
        MemberDTO.name = "홍길동" ;
        MemberDTO.phone = "010-1111-1111" ;
        System.out.println(MemberDTO.name + MemberDTO.phone );

        MemberDTO.play();
        MemberDTO.eat();
        MemberDTO.walk();

    }
}

//객체를 접근하는 권한
// 접근제어 (AccessModifier)란?
//객체의 상태 정보는 중요하기 때문에 접근을 못하게 해야 한다 ( 정보은닉)
//객체의 행위 정보는 상호작용을 해야 되기 때문에 접근을 허용한다

//Package의 개념
//서로 기능이 비슷한 클래스끼지 모아서 관리를 쉽게 하도록 하기 위함 (폴더 개념)
// 패키지 외부에서 클래스의 접근을 할 수 없도록 하기 위해서 사용 (보안 측면)
// 자바에서 제공해주는 API도 패키지의 형태로 배포
//java.lang , java.io , java.net , java.util , java.sql , java.math ...

