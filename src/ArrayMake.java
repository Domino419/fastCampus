public class ArrayMake {
    public static void main(String[] args) {
        //Q. 정수 5개를 생성할 배열을 생성하기
        int [] a = new int [5] ;
        int FINAL_NO = 10 ;  // 배열에 넣어줄 상수값

        for (int i = 0; i < a.length ; i++) {
            a[i] = FINAL_NO ;
            System.out.println("a[" + i + "] = " + a[i]  );
        }

        float [] f = new float[5] ; //길이가 고정
        Book[] b =new Book[3] ; // Book 3권을 저장할 배열을 생성
    }
}
