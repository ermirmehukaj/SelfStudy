package Basics2;

import java.util.Arrays;
import java.util.List;

public class OddOrEven {

    public static void main(String[] args) {
        System.out.println(oddOrEven(Arrays.asList(2,2,4)));
    }

    public static String oddOrEven(List<Integer> array) {
        int sum = 0;
        for (Integer integer : array) {
              sum += integer;
        }

        if(sum %2 !=0) {
            return "odd";
        }else {
             return "even";
    }
}

}
/*
Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).
 */