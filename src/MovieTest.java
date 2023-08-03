public class MovieTest {
    public static void main(String[] args) {
        Movie Movie = new Movie() ;
        Movie.title ="아바타" ;
        Movie.date ="2022.12.14" ;
        Movie.act ="제이크 설리" ;
        Movie.gubun = "액션" ;
        Movie.time = 192 ;
        Movie.level = "12세" ;

        System.out.println("-->>>" + Movie.title + "\t" +Movie.date + "\t" +Movie.act +"\t" + Movie.gubun +"\t" +Movie.time + "\t" +Movie.level);

    }
}

/*public class Movie {
    public String title ; //제목
    public String date ;  //개봉일
    public String act ;   // 주인공
    public String gubun ;  //장르
    public int time ;  //러닝타임
    public String level ;  //등급
} */
