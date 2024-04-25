package Basics;

public class FIndFIrstIndex {

    public static void main(String[] args) {

        String str1 = "sadbutsad";
        String str2 = "let";
        System.out.println(index(str1, str2));

    }

    public static int index(String str1,String str2){

        return str1.indexOf(str2);



    }
}

/*

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
 */
