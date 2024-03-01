package GroupPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeArray {

    public static void main(String[] args) {
        String[] arr1 = {"abc", "car", "ada", "racecar", "cool"};
        String[] arr2 = {"def", "ab"};

        System.out.println(palindrome(arr1));
        System.out.println(palindrome(arr2));

    }


    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll(" ", "");
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse.equals(str);
    }

    public static ArrayList<String> palindrome(String[] str1) {
        ArrayList<String> result = new ArrayList<>();

        for (String each : str1) {
            if (isPalindrome(each)) {
                result.add(each);
            }


        }
        return result;
    }


}

/*
Write a method that takes in a non-empty array of Strings that will return an ArrayList which consists of palindromic strings in given array.
The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
 Examples: Input: String[] arr = {“abc”, “car”, “ada”, “racecar”, “cool”} Output: [“ada”, “racecar”]
 Explanation: These two are the only palindrome strings in the given array  Input: String[] arr = {“def”, “ab”} Output:[]
 */