package Basic3;

import java.util.ArrayList;

public class FindStrayNumber {

    public static void main(String[] args) {
        int[] arr = {17, 17, 3, 17, 17, 17, 17};

        System.out.println(number(arr));
    }


    static int number(int[] array) {

        if (array[0] != array[1] && array[0] != array[2]) return array[0];
        for (int each : array) if(each != array[0]) return each;


return 0;

}}
/*
You are given an odd-length array of integers, in which all of them are the same, except for one single number.

Complete the method which accepts such an array, and returns that single different number.

The input array will always be valid! (odd-length >= 3)

 */