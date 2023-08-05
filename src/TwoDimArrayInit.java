public class TwoDimArrayInit {
    public static void main(String[] args) {
        //Q. 2차원 배열의 초기화 (행 단위로) 와 반복문을 활용한 원소 접근
        int [][] a = {
                {10,11,12,13},
                {20,21,22,23},
        } ;

        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length ; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();  //줄 바꿈
            }

        int [][] b = new int [5][] ;
        b[0] = new int [1] ;
        b[1] = new int [2] ;
        b[2] = new int [3] ;
        b[3] = new int [4] ;
        b[4] = new int [5] ;
        for (int i = 0; i < b.length ; i++) {
            for (int j = 0; j < b[i].length ; j++) {
                b[i][j] = '☆' ;
                System.out.print((char)b[i][j]+"\t");
            }
            System.out.println();  //줄 바꿈
        }

    }
}


// 동일한 데이터를 연속적으로 여러개 저장할 수 있는 자료구조 = 배열
// 배열의 길이를 구하는 속성 = length
// 3행 4열의 실수형 배열을 생성하시오 = float [][] f = new float [3][4]
// int [][] x = new int [3][5] 주어진 배열에서 x.lehgtn의 갑소가 x[0].length의 값은 =- 3, 5
// int [][] a = ((1,2,3,4},{5,6,7,8}} 주어진 배열에서 a[1][3]의 값은 - 8
