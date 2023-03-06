package section5;

public class Sumfrom1to100 {
    public static void main(String[] args) {
        //read
        var from = 1;
        var to = 100;
        var sum = 0;


        //process

        for (int i = from; i <= to; i++) {
            sum += i;

        }

        //display
        System.out.print((sum) + " ");




    }
}
