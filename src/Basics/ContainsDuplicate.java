package Basics;

import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] arrayy = {1,2,3,4};
        System.out.println(duplictae(arrayy));
    }

    public static boolean duplictae(int [] array){

        // stream solution
        return Arrays.stream(array).distinct().count() < array.length;
      // loop solution
      /*  for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] == array[j]){
                    return true;
                }
            }
        }

return false;*/

}}

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
 */