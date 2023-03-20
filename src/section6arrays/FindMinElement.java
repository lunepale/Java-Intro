package section6arrays;

public class FindMinElement {
    public static void main(String[] args) {
        int[] source = {1, -1, 3, 4, 5, 6, 7, 8, 9, -7, 11, 12, 13, 14, 15};
        int minValue = source[0];
        for (int i = 0; i < source.length; i++) {

            if(minValue > source[i]) {
                minValue = source[i];

            }
        }
        System.out.println(minValue);



    }
}
