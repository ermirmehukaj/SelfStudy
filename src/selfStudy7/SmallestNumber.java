package selfStudy7;

import java.util.Arrays;

public class SmallestNumber {

    public static void main(String[] args) {

        int[] array = {5, 7, 89, 2, 1};

        System.out.println(Arrays.toString(smallestNumber(array)));
    }


    public static int[] smallestNumber(int[] array) {


        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;// Move the current min to secondMin
                min = array[i];// Update the min
            } else if (array[i] < secondMin && array[i] != min) { // Update the secondMin if it's smaller than the current secondMin and not equal to min
                secondMin = array[i];
            }
        }
        return new int[]{min, secondMin};
    }
}
