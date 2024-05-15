package Basics2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {


        int[] a = {2, 7, 11, 15};
        System.out.println(Arrays.toString(sum(a,9)));


    }

    public static int[] sum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int value = target - arr[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};

            } else map.put(arr[i], i);
        }

        return new int[]{};
    }
}
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
 */