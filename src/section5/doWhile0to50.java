package section5;

public class doWhile0to50 {
    public static void main(String[] args) {

        int i = -1;
        int to = 50;
        do {
            i++;
            if (i % 2 == 0) {

                System.out.print(i+ " ");
            }

        }while (i < to) ;
    }
}