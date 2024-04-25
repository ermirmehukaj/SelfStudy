package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int [] array = {4,3,5,8,7};
        int target = 8;

        System.out.println(Arrays.toString(twoSUm(array,target)));
    }


    public static int [] twoSUm(int [] nums , int target){


        Map<Integer,Integer> map = new HashMap<>();

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int result = target- nums[i];
            if(map.containsKey(result)){
                return new int[]{map.get(result)};
            }
            map.put(nums[i],i);
        }
        return new int[] {};
    }
}
