package section6arrays;

public class CheckIfAllnumberArePositive {
    public static void main(String[] args) {

        int[] array= {-1,2,3,5,0};
        var allPositive=true;
        //


            for (int value:array) {
                if (value < 0) {
                    allPositive = false;
                    break;

                }
            }
        System.out.println(allPositive ? "All positive" : "Not all positive");

    }
}
