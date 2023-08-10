package fc.java.model;

public class MovieVO {
    private String title;  //영화제목
    private int day;       //개봉일
    private String major;  //주연배우
    private  String part;   //장르
    private float time;    //상영시간
    private int level;     //연령제한

    //디폴트 생성자
    public MovieVO() {
    }

    public MovieVO(String title, int day, String major, String part, float time, int level) {
        this.title = title;
        this.day = day;
        this.major = major;
        this.part = part;
        this.time = time;
        this.level = level;
    }


    //getter , setter 생성
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "BestVOModeling{" +
                "title='" + title + '\'' +
                ", day=" + day +
                ", major='" + major + '\'' +
                ", part='" + part + '\'' +
                ", time=" + time +
                ", level=" + level +
                '}';
    }
}

// 잘 설계된 Vo클래스란 ?
//디폴트 생성자를 반드시 만들기
// 생성자 메서드를 오버로딩 하여 객체 초기화 하기
// setter  ,  getter 만들기
// toString() 메서드를 만들기(객체가 가지고 있는 전체 값 출력용도