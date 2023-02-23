package section5;

public class DisplayNumbersFrom100to1 {
    public static void main(String[] args) {
      //  for (int i = 100; i >= 1; i--) {
        //    System.out.print(i + " ");


        //as it's supposed to be
        //read
        var from = 100;
        var to = 1;
        var step = 1;

        //display
        for (int i = from; i >= to; i -= step) {
            System.out.print(i + " ");
        }



    }
}
