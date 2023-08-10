package fc.java.part3;

public class StaticTest {
    public static void main(String[] args) {  // << 1!!
        int a = 10;
        int b = 20 ;
        hap(a,b) ;
        int sum = hap(a,b) ;
        System.out.println(sum);
    }

    //Q. 매개변수로 2개의 정수를 입력 받아서 총합을 구하여 리터나는 메서드를 정의하세요
    public static int hap(int a, int b) {  // <<< 2!
        int V = a+b ;
        return V ;
    }
}


//① JVM이 실행할 class를 찾는다.
//② static keyword가 붙어있는 멤버들을 정해진 메모리(static-zone) 위치에 자동으로 로딩한다. (호출하지 않아도 자동 로딩)
// - static 멤버들을 클래스를 사용하는 시점에서 딱 한번 메모리에 로딩된다.
// - main() 메서드가 static이기 때문에 메모리에 자동으로 로딩한다.
// ③ JVM이 static-zone에서 main() 메서드를 호출한다.
// ④ 호출된 메서드를 Call Stack Frame Area(Stack Area)에 push(기계어코드를 넣고) 한 뒤 동작을 시작한다.

