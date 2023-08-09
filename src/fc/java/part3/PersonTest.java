package fc.java.part3;

import fc.java.model.PersonDTO;

public class PersonTest {
    public static void main(String[] args) {
        // Q. Person 객체를 생성하고 이름, 나이, 전화번호를 저장하고 출력하세요.
        PersonDTO PersonDTO = new PersonDTO();  // instance !
        PersonDTO.age = 18;
        PersonDTO.name = "홍길동";
        PersonDTO.phone = "010-1234-5678";
        System.out.println(PersonDTO.age + "\t" + PersonDTO.phone + "\t" + PersonDTO.name);

        //Q. Person 객체를 생성하고 play(), eat(), walk() 동작을 호출하여 실행하세요
        PersonDTO.eat();
        PersonDTO.play();
        PersonDTO.walk();


        // Person을 여러개 만들기 편하게 하고 싶어서 코딩 -
        int[] age = {18, 19, 20, 21, 22, 23};
        String[] name = {"일길동", "이길동", "삼길동", "사길동", "오길동"};
        String[] phone = {"1234", "1235", "1236", "1237", "1238"};

        for (int i = 0; i < 5; i++) {
            System.out.println( i + "번째 Person---------------");
            PersonDTO.age = age[i];
            PersonDTO.name = name[i];
            PersonDTO.phone = "010-6819-" + phone[i];
            System.out.println(PersonDTO.age + "\t" + PersonDTO.phone + "\t" + PersonDTO.name);

            //Q. Person 객체를 생성하고 play(), eat(), walk() 동작을 호출하여 실행하세요
            PersonDTO.eat();
            PersonDTO.play();
            PersonDTO.walk();

        }

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

// this : 자신을 가리키는 객체변수 , 참조변수, 포인터 변수.
