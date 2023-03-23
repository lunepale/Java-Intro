package section6arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] source = {1,2,3,4,5};
                System.out.println(Arrays.toString(source));
//

        for (int i = 0; i < source.length / 2; i++) {
            var temp=source[i];
            source[i] = source[source.length -i- 1];
            source[source.length - i-1] = temp;
        }
        System.out.println(Arrays.toString(source));

    }
}
