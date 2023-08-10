package fc.java.part3;

import fc.java.model.StudentVo;

public class StudentTest {
    public static void main(String[] args) {
        // 정수 6개를 저장할 배열을 생성
        int[] arrayList = new int[6];
        arrayList[0] = 0;
        arrayList[1] = 10;
        arrayList[2] = 20;
        arrayList[3] = 30;
        arrayList[4] = 40;
        arrayList[5] = 50;

        for (int i = 0; i < arrayList.length; i++) {
            System.out.println(arrayList[i]);
        }

        // Q.설계된 학생(Student) 객체를 설계하고 데이터를 저장 한 후 출력하기
        StudentVo StudentVo = new StudentVo("홍길동", "컴공", 20, "Fastcampus@naver.com", 20120505, "010-1111-1234");
        StudentVo StudentVo2 = new StudentVo("고길동", "철학", 25, "Fastcampus@naver.com", 20100505, "010-2222-1234");
        System.out.println(StudentVo.toString());
        System.out.println(StudentVo2.toString());



    }
}
