package fc.java.part2;

public class PersonTest {
    public static void main(String[] args) {

    }
}

//사용자 정의 자료형의 이해
//클래스란 무엇인가
//객체 생성 과정의 이해
//생성자 메서드와 this

//사용자 정의 자료형의 이해
// ㅇ기본 자료형
// 한개의 정수 데이터를 저장하기 위한 변수 선언 int a ;
// 한개의 실수 데이터를 저장하기 위한 변수 선언 float a ;
// 한개의 문자 데이터를 저장하기 위한 변수 선언 chat a;

// ㅇ사용자 정의 자료형 ( fc.java.part2.Book, member, fc.java.part2.Movie )
// 한 권의 책 데이터를 저장하기 위한 변수 선언 fc.java.part2.Book a ;
// 한명의 헬스클럽 회원 데이터를 저장하기 위한 변수 선언 member a ;
// 한 편의 영화 데이터를 저장하기 위한 변수 선언 fc.java.part2.Movie a ;


//ㅇ객체 (Object ) = 이질적인 구조 = 모델(Model) = 덩어리 ( Value Object) = 바구니 = 이동 ( Data Transfer Object)
// 책 데이터를 변수에 저장하기 위한 책 자료형  -  BookDTO = 책
// 헬스클럽 회원 데이터를 저장하기 위한 회원 자료형  - memberDTO = 회원
// 영화 데이터를 저장하기 위한 영화 자료형  - MovieDTO = 영화

//ㅇ클래스 (class) =  객체를 설계 = 모델링 하는 도구
// 자료형 측면 : 새로운 자료형을 만드는 도구, 우리가 객체를 설계해서 써야 하기 때문에 ..
// public으로 접근 제어자를 사용,

// Packege : 기능이 비슷한 클래스끼지 묶어주자