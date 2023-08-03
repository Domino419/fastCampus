public class ArrayMake {
    public static void main(String[] args) {
        //Q. 정수 5개를 생성할 배열을 생성하기
        int [] a = new int [5] ;
        for (int i = 0; i < a.length ; i++) {
           // System.out.println("i값 = " + i);
            a[i] = i ;
            System.out.println("a[" + i + "] = " + a[i]  );
        }
        float [] f = new float[5] ; //길이가 고정

        Book[] b =new Book[3] ; // Book 3권을 저장할 배열을 생성
    }
}
