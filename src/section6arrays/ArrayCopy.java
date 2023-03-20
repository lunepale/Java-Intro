package section6arrays;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int [] array1 = {1,2,3,4,5};
        int[] array2 = {0,0,0,0,0};
        System.out.println(Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(Arrays.toString(array2));


    }
}
