package section6arrays;

public class ArrayElementSum {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int result = 0;

        //
        for (int i = 0; i <= source.length; i++) {
            result = result + i;
        }

        //
        System.out.println(result);


    }
}
