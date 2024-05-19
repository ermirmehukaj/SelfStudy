package Basics2;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoIntegers {

    public static void main(String[] args) {

        int [] arr  = {4,5,7,5,4,8};
        System.out.println(sum(arr));
    }


    static int sum(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();


        for (Integer each : array) {
            map.put(each, map.getOrDefault(each, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum+= entry.getKey();
            }
        }
        return sum;
    }
}
/*
In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice.
 Your task will be to return the sum of the numbers that occur only once.

For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once,
and their sum is 15. Every other number occurs twice.
 */