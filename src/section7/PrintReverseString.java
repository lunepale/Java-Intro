package section7;

public class PrintReverseString {
    public static void main(String[] args) {
        String s="hello world!";
        for (int i = s.length()-1; i >=0;i-- ) {

            System.out.print(s.charAt(i));
        }
        System.out.println();
    }

}
