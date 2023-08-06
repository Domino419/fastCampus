package fc.java.part2;

public class ArrayExam {
    public static void main(String[] args) {
        //Q. 아래 chat[] 배열에 APPLE 이라는 문자를 저장하고, 소문자 apple로 출력하기
        char [] arrayList = {'A','P','P','L','E'} ;
        String [] arratListLast = new String [arrayList.length] ;
        for (int i = 0; i < arrayList.length ; i++) {
            arratListLast[i] = String.valueOf( arrayList[i]); //char를 String으로 형변환 해주자
            arratListLast[i] = arratListLast[i].toLowerCase(); // 다시 소문자로 바꿔주자
            System.out.println("arratListLast["+i+"]  =  " + arratListLast[i]);
            // System.out.print( arratListLast[i]); //개행없이 apple로 깔끔하게 출력
        }
    }
}

// 강의에서는 아스키코드값에 +32를 해서 출력하는 예시를 보여줌.
// 그냥 API 쓰면 안되나? ...