package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        MovieVO MovieVO = new MovieVO("아바타",20230820,"홍길동","약션",192.0f,12) ;
        System.out.println(MovieVO.toString());
        System.out.println(MovieVO.getLevel()) ;
    }

}
