public class LoopLoopTest {
    public static void main(String[] args) {
        // 이중 반복문을 사용하여 구구단을

        for (int i = 2 ; i < 10 ; i++) {
            System.out.print(i+ "단" + "   \t" );
        }
        System.out.println();


        for (int i = 1; i < 10 ; i++) {
            for (int j = 2; j < 10 ; j++) {
                if(j==9){
                    //8면 개행, println
                    System.out.print( j + "*" +  i +"=" + i *j + " \n" );
                }else{
                    //9가 아니면 한줄로 print
                    System.out.print( j + "*" +  i +"=" + i *j  + "\t");
                }


            }
        }
    }
}
