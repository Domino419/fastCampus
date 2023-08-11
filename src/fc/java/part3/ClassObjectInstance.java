package fc.java.part3;

import fc.java.model.StudentVo;

public class ClassObjectInstance {
    public static void main(String[] args) {
        StudentVo st1 ;
        StudentVo st2 ;
        StudentVo st3 ;

       st1 = new StudentVo("고길동", "철학", 25, "Fastcampus@naver.com", 20100505, "010-0000-1234");
       st2 = new StudentVo("고길동", "철학", 25, "Fastcampus@naver.com", 20100505, "010-1111-1234");
       st3 = new StudentVo("고길동", "철학", 25, "Fastcampus@naver.com", 20100505, "010-2222-1234");

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println(st3.toString());

    }
}
