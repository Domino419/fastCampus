import java.util.Random;

public class OverloadingTest {
    public static void main(String[] args) {
        float v = add(35.6f, 56.7f) ;  //ex a+b = 92.3
        System.out.println("float v = " + v);

        int vv = add(10,50) ;
        System.out.println("int vv  = " + vv);
    }
    //매개변수로 두개의 정수값을 받아서 리턴
    private static int add(int a, int b) {
        int sum = a+b ;
        return sum ;
    }
    //매개변수로 두개의 실수값을 받아서 리턴
    private static float add(float a, float b) {
        float sum = a+b ;
        return sum ;
    }
}

// 하나의 클래스 내에서 동일한 이름의 메서드를 여러개 사용할 수 있는 객체지향 기법
// 오버로딩의 전제 조건 -> 메서드의 시그니처(signature)가 달라야 한다 ( 매개변수의 개수, 매개변수의 타입 등)

// 정적 바인딩 : 컴파일 시점에서 사용될(호출될) 메서드가 결정(연결) 되는 바인딩
// ※ 메소드 이름이 다르더라도 자료평이나 매개변수 갯수가 다르므로 중복 이름을허용한다