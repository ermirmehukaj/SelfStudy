package Basics2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountOddAndEven {

    public static void main(String[] args) {

        int[] array = {1, 2, 3 ,4 ,5};
        System.out.println(Arrays.toString(count(array)));
    }

    public static int[] count(int [ ] array){
     int countEven = 0,countOdd=0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 ==0){
                countEven++;
            }else {
                 countOdd++;
            }
        }
        return new int [] {countEven,countOdd};
    }
}
