package fc.java.part2;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        // Q.행열로 데이터 저장하기 ( 2차원 배열, 테이블구조, 행렬)
        // int [햏][열] = new int [행][열]
        int[][] aa = new int[2][4];

        // 출력을 위한 샘플 데이터 생성~
        aa = new int[][]{
                {10, 11, 12, 13},
                {20, 21, 22, 23},
                {30, 31, 32, 32}
        };

        int count = 0;
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                if (count < 4) {  //J가 4보가 작으면 한줄로
                    System.out.print(aa[i][j] + " " );
                    count ++ ;
                } else {   // 한줄을 다 채우면 1부터 다시 시작
                    System.out.println();
                    System.out.print(aa[i][j]+ " ");
                    count = 1 ;  // count 초기화~
                }
            }
        }
    }
}
