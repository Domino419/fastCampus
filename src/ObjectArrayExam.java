public class ObjectArrayExam {
    public static void main(String[] args) {
        //Q. 영화 3편을 저장할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하기
        Movie [] Movie = new Movie[3] ;

        for (int i = 0; i < Movie.length ; i++) {
            Movie[i] = new Movie();
            Movie[i].title = "제목" + i + "번째";
            Movie[i].level = "등급" + (i + 10) + "세";
            Movie[i].time = 100 + i;  //시간
            Movie[i].act = "홍길동" + i;  //배우
            Movie[i].gubun = "장르" + i + "";
            Movie[i].date = "(20230501 + i )";
            System.out.print("index는 " + ( i +1 )+ "번째 영화 데이터  ");
            System.out.println(Movie[i].title + "--" + Movie[i].date + "--" + Movie[i].level + "--"
                    + Movie[i].act + "--" + Movie[i].gubun + "--" + Movie[i].time);
        }


    }
}
