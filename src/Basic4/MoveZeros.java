package Basic4;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int [ ] arr = {1,3,0,4,0,1,2};
        move(arr);

        System.out.println(Arrays.toString(arr));

    }


    public static void move(int [] array){

        int lastNonZeroFoundAt =0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[lastNonZeroFoundAt] = array[i];
                lastNonZeroFoundAt++;
            }
        }

        // Fill remaining elements with zeros
        for (int i = lastNonZeroFoundAt; i < array.length; i++) {
            array[i] = 0;
        }
}}
