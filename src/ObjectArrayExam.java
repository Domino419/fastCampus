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
            Movie[i].date = "2023-05-0" + i ;
            System.out.print("첫번째 방법의 index는 " + ( i +1 )+ "번째 영화 데이터  ");
            System.out.println(Movie[i].title + "--" + Movie[i].date + "--" + Movie[i].level + "--"
                    + Movie[i].act + "--" + Movie[i].gubun + "--" + Movie[i].time);
        }

        //Q를 다른 방법으로 만들어보기
        String [] title = {"A영화","B영화","C영화"} ;
        String [] level = {"10세","15세","20세"} ;
        int [] time = {100,150,200} ;
        String [] act = {"홍길동","김영희","김철수"} ;
        String [] gubun = {"교양","다큐","로맨스"} ;
        String [] date = {"2023-05-07","2023-05-17","2023-05-27"} ;

        for (int i = 0; i < Movie.length ; i++) {
            Movie[i] = new Movie();
            Movie[i].title = title [i] ;
            Movie[i].level = level[i];
            Movie[i].time = time[i] ;//시간
            Movie[i].act = act[i];  //배우
            Movie[i].gubun = gubun[i];
            Movie[i].date = date [i] ;
            System.out.print("두번째 방법의 index는 " + ( i +1 )+ "번째 영화 데이터  ");
            System.out.println(Movie[i].title + "--" + Movie[i].date + "--" + Movie[i].level + "--"
                    + Movie[i].act + "--" + Movie[i].gubun + "--" + Movie[i].time);
        }





    }
}
