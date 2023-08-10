package fc.java.part3;

import fc.java.model.StudentVo;

public class StudentArrayTest {
    public static void main(String[] args) {
        
        //Q.객체 배열을 이용하여 4명의 데이터를 저장하기 
        StudentVo[] StudentVoArray = new StudentVo[4] ;
        StudentVoArray[0] = new StudentVo("홍길동", "컴공", 23, "Fastcampus0@naver.com", 20100101, "010-1111-0000");
        StudentVoArray[1] = new StudentVo("나길동", "전기", 33, "Fastcampus1@naver.com", 20110202, "010-1111-1111");
        StudentVoArray[2] = new StudentVo("김길동", "건축", 43, "Fastcampus2@naver.com", 20120303, "010-1111-2222");
        StudentVoArray[3] = new StudentVo("이길동", "통신", 53, "Fastcampus3@naver.com", 20130404, "010-1111-3333");

        //Q.객체 배열의 학생 데이터 출력하기
        for (int i = 0; i < StudentVoArray.length; i++) {
            System.out.println(StudentVoArray[i].toString());
        }

    }
}
