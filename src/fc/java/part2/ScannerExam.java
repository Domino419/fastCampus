package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        //도서 정보 입력 받기
        Scanner scan = new Scanner(System.in) ;
        System.out.println("제목:");
        String title = scan.nextLine() ;
        System.out.println(" title = " + title );

        System.out.println("가격:");
        int price = scan.nextInt() ;
        System.out.println(" price = " + price );
        scan.nextLine(); // 버퍼 비우기

        System.out.println("출판사:");
        String company = scan.nextLine() ;
        System.out.println(" company = " + company );

        System.out.println("작가:");
        String author = scan.nextLine() ;
        System.out.println(" author = " + author );

        System.out.println("page:");
        int page = scan.nextInt() ;
        System.out.println(" page = " + page );
        scan.nextLine(); // 버퍼 비우기

        System.out.println("isbn :");
        String isbn = scan.nextLine() ;
        System.out.println(" isbn = " + isbn );
        scan.close();

        System.out.println("-->>>  " + title + "\t" + page + "\t" + company + "\t"
                + author + "\t" + page + "\t" + isbn + "\t");





    }
}
