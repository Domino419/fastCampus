public class ArrayBasicTest {
    public static void main(String[] args) {
        // 자료형 변수 ;
        int tempA ;
        Book tempb ;
        String tempS ;

        //자료형 [] 변수
        int [] aa ;
        Book[] bb ;
        String[] ss ;

        //Q1.정수 3개를 저장할 변수를 선언하고 모두 10을 저장하기
        int A = 10 ;
        int B = 10 ;
        int c = 10 ;

        //Q2. 정수5개를 저장할 배열을 생성하도 모든 원소에 10을 저장하기
        System.out.println("Q1 ------");
        int [] arraylist = new int[5] ;
        for (int i = 0; i < arraylist.length  ; i++) {
            arraylist[i] = 10;
            System.out.println("arraylist[" + i + "]  " + arraylist[i]);
        }

        //Q3.정수 5개를 배열에 초기화하고 index 0번째와 3번째 값을 더하여 출력하기
        System.out.println("Q2------");
        int [] arrayList2 = new int[]  {10,20,30,40,50} ;
        System.out.println("arrayList2[0] =  " +arrayList2[0]+ ", arrayList2[3] =  "+  arrayList2[3]);
        System.out.println(arrayList2[0] + arrayList2[3]);

    }
}

// 데이터의 이동 배열을 이해하기
// 여러개의 데이터를 다루는 배열(array)
