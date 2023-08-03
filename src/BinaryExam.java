public class BinaryExam {
    public static void main(String[] args) {
        System.out.println("BinaryExam");
        int date = 123 ;

        String binary = Integer.toBinaryString(date) ;
        System.out.println(binary);
        String octal = Integer.toOctalString(date) ;
        System.out.println(octal);
        String hexa = Integer.toHexString(date) ;
        System.out.println(hexa);

        int x = 123 ;
        System.out.println("x = " + x);
        int y = 0b1111011 ;
        System.out.println("y = " + y);
    }
}
