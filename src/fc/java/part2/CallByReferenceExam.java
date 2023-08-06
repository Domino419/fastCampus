package fc.java.part2;

public class CallByReferenceExam {
    public static void main(String[] args) {

        int [] arrayList = {1,2,3,4,5} ;
        int result = addArray(arrayList) ;
        System.out.println("리턴된 결과값은 : " +  result );
    }

    //매개변수로 정수형 배열을 받아서 배열의 총합을 구하여 리턴하는 메소드를 정의하기
    public static int addArray(int [] arrayList){
        int sum = 0 ;
        for (int i = 0; i < arrayList.length ; i++) {
            System.out.println(" sum 값은 " + sum + "  arrayList[" + i + "] = " + arrayList[i] );
            sum =sum + arrayList[i] ;
           // System.out.println(sum);
        }
        return sum;
    }
}
