public class BasicArrayTest {
    public static void main(String[] args) {
        //Q1.실수 3개를 저장할 배열을 생성하고 값을 저장하자
        float [] f = new float[3] ;
        f[0] = 17.4f ;
        f[1] = 59.2f ;
        f[2] = 34.8f ;
        for (int i = 0; i < f.length ; i++) {
            float tempF = f[i] < 1 ? 10.0f : 12.5f ;
            System.out.println(tempF);
        }

        //Q2.책 3권을 저장할 [배열을 생성]하고 책 3권의 데이터를 저장하고 출력하기
        Book [] b = new Book[3] ;  //객체 배열
        for (int i = 0; i < b.length ; i++) {
            b[i] = new Book() ;
            b[i].title = "책제목" + i ;
            b[i].price = 100 + i ;
            b[i].author = "저자명" + i  ;
            b[i].company = "출판사"  +  i ;
            b[i].isbn = "1234A" + i  ;
            b[i].page = 100 + i ;
            System.out.println("index가 " + i );
            System.out.println(b[i].title + "--"+b[i].price + "--" + b[i].author + "--"
                    +b[i].isbn + "--" +b[i].company +"--"+ b[i].page );
        }





    }
}
