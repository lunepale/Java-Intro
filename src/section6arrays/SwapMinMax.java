package section6arrays;

import java.util.Arrays;

public class SwapMinMax {
    public static void main(String[] args) {
        int[] source= {1, -2, 3, 8, 5,10};
        int minValue = 0;
        int maxValue = 0;
        System.out.println(Arrays.toString(source));
        //process
        for (int i = 0; i < source.length; i++) {
                        if(minValue > source[i]){
                minValue = i;
            }
        if (maxValue < source[i]) {
            maxValue = i;
           var temp=source[minValue];
            source[minValue] = source[maxValue];
            source[maxValue] = temp;
        }
        }
        System.out.println(Arrays.toString(source));


    }
}
