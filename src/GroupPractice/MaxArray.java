package GroupPractice;

import java.util.Arrays;

public class MaxArray {
    public static int maxNumber (int [] array){
      return   Arrays.stream(array)
              .max()
              .orElseThrow();


    }

    public static void main(String[] args) {
        int[] array1 ={6, 18, 3, 5, 1, 9};
        System.out.println(maxNumber(array1));

    }
}

/*Question-1 Find Max from int Array
        Write a function that can find the maximum number from an int Array.
        input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9*/
