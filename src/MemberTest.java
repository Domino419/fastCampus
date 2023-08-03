public class MemberTest {
    public static void main(String[] args) {
    //Q2.헬스클럽 회원 데이터를 저장하고 출력하기
    Member Member = new Member() ;
    Member.address ="서울" ;
    Member.name = "홍길동" ;
    Member.age = 30 ;
    Member.ctn ="010-1111-1111" ;
    Member.email = "fc@naver.com" ;
    Member.kg = "57.6Kg" ;
    System.out.println("-->>>" + Member.name + "\t" + Member.age + "\t"
            + Member.ctn + "\t" + Member.email + "\t" + Member.address + "\t" + Member.kg);
    }
}

// 새로운 자료형을 만드는 모델링 도구 - class
// 객체를 생성할 때 사용하는 연산자와 메서드는 new, 생성자
// 클래스 안에 만들어지는 변수는 속성, 멤버변수, 프로퍼티 등으로 부른다.
// 클래스 안에 있는 title 이라는 멤버변수를 참조하는 연산자는 dot ( 도트 연산자, 참조연산자)
