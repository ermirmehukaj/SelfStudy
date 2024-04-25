package Basics;

import java.util.Arrays;

public class RemoveElementArray {

    public static void main(String[] args) {
        int [] myArray = {1,2,4,6,2,8,2};
        int val = 2;

        System.out.println(countNumbers(myArray,val));

    }


    public static int countNumbers(int[] array, int value) {

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                result++;
            }
        }
        return result;

    }


}
