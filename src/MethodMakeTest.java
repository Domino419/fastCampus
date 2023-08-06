import java.util.Random;

public class MethodMakeTest {
    public static void main(String[] args) {
     //Q. 매개변수로 2개의 정수를 받아서 총합을 구하려 리턴하는 메소드를 만들어 보자.
        Random random = new Random();
        int a = random.nextInt(100)  ;
        int b = random.nextInt(100)  ;
        System.out.println( "a의 값은 " + a + "   b의 값은 " + b );

        addValue(a,b) ;

        int tempNo = addValue2(a,b); ;
        System.out.println(" --- addValue2의 결과   a+b = : " + tempNo);

    }
    //return 값이 없는 함수를 만들어서 함수 안에서 결과값을 출력하기
    public static void  addValue(int a, int b){
        System.out.println(" --- addValue 의 결과   a+b = " + (a+b));
       // return ;
    }

    //int로 return 값을 받아서 호출한 곳에서 결과값을 출력하기  
    public static int addValue2(int a, int b){
        return  (a+b) ;
    }



}

// Ch8.메서드와 변수의 관계를 이해하기
// 객체가 가지고 있는 동작, 기능을 메서드라고 하고 메서드를 정의하고, 메서드를 호출하는 방법에 대해서 학습한다.
// 메서드란 무엇인가
// 메서드는 변수
// 매개변수 전달기법 ( parameter passing )
// 메서드 오버로딩 ( Overloading)

//접근제한자 + 리턴타입  + 메소드명 ( 인수1, 인수2...)
//인수 - 매개변수는 콤마로 구분하며 매개변수가 없더라도 ()룰 입력
//리턴타입 - 수행된 후 반환값 or 반환값이 없으면 void