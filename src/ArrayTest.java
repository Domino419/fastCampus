public class ArrayTest {
    public static void main(String[] args) {
        //Q1. 정수 5개를 저장할 배열을 생성하고 모든 원소에 10을 저장하여 출력하기
        int[] a = new int[5];
        int FINAL_NO = 10;

        for (int i = 0; i < a.length; i++) {
            a[i] = FINAL_NO;
            System.out.println("a[" + i + "] = " + a[i]);
        }
        //Q2. 정수 5개를 아래처럼 배열에 초기화하고 index 0번째와 index 3번째 값을 더하여 출력하기
        int sum = a[0] + a[3] ;
        System.out.println(">>> a[0]=" + a[0] + "   a[3]=" + a[3]);
        System.out.println(">>> a 배열의 길이 =  " + a.length );



    }
}
