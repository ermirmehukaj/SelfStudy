package selfStudy3;

import java.util.Arrays;

public class NumbersArray {

    public static void main(String[] args) {

       int nums[] = {1,2,3,4,5};
int[] reverse = new int[nums.length];
        for (int i = nums.length - 1,j=0; i >= 0; i--,j++) {
            reverse[j]=nums[i];
        }
        System.out.println(Arrays.toString(reverse));


    }
}
   /* Write a program that can reverse an array of integers and return it as a new array
        Ex:
        array = {1,2,3,4,5};

        output:
        reversedArray = {5,4,3,2,1};*/