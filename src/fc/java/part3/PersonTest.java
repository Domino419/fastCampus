package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        // Q. 한사람의 데이터를 저장할 변수를 선언하세요.
        PersonDTO PersonDTO = new PersonDTO () ;  // instance !

    }
}

// 생성자 메서드란
// new 연산에 의해서 호출이 된다.
// 자신이 가지고 있는 멤버들을 메모리에 올려 객체를 생성하는 역할
// 메서드 이름은 클래스이름과 동일해야 한다.
// 접근제한자가 public인 경우에만 호출이 된다.
// 모든 클래스는 기본생성자(default constructor)를 가지고 있다.
// 객체의 초기화를 위해서 사용된다.
// 리턴타입이 없다.( void도 쓰지 않는다)