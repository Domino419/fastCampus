public class BookExam {
    public static void main(String[] args) {
        //Q1.Book class를 이용해서 책정보를 저장하고 출력하기
        Book Book = new Book() ;
        Book.isbn = "1234ABCD" ;
        Book.page = 10 ;
        Book.price = 0 ;
        Book.company = "익명의출판사" ;
        Book.author = "저자이름" ;
        Book.title = "제목" ;
        System.out.println("-->>>  " + Book.title + "\t" + Book.page + "\t" + Book.company + "\t" + Book.author + "\t" + Book.page + "\t" + Book.isbn + "\t");

    }
}
