package fc.java.part2;

public class BookTest {
    public static void main(String[] args) {
        //Q1. 한권의 책 데이터를 저장하고 출력하기. (변수는 6개)
        String title = "Q1의 데이터"; // 제목
        int price = 30000; //가격
        String company = "fastCampus";  //출판사
        String author = "김영수";  //저자
        int page = 300;  //페이지수
        String isbn = "123A123";   //ISBN
        System.out.println("-->>>  " +title + "\t" + page + "\t" + company + "\t" + author + "\t" + page + "\t" + isbn + "\t");

        //Q2. 책 한권을 저장할 변수를 선언하기
        // 1.fc.java.part2.Book b ;  //변수를 선언하고
        // 2. new fc.java.part2.Book() ;  // 객체를 생성 (실체를 만들고)
        // 3. b = new fc.java.part2.Book()  ; // 생성된 객체를 연결(저장)

        Book Book = new Book() ;
        Book.title = "제목" ;
        Book.price = 10000 ;
        Book.company = "몰루출판사" ;
        Book.author = "익명" ;
        Book.isbn ="1Q2W3E4R" ;
        Book.page = 300 ;
        System.out.println("-->>>  " + Book.title + "\t" + Book.page + "\t" + Book.company + "\t" + Book.author + "\t" + Book.page + "\t" + Book.isbn + "\t");
    }
}
