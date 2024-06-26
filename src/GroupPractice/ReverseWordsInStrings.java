package GroupPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordsInStrings {

    public static void main(String[] args) {
        String str = "hello world ";

        System.out.println(reverse(str));
    }
    public static String reverse(String str){




       List<String> list = Arrays.stream(str.trim().split("\\s+")).collect(Collectors.toList());

       Collections.reverse(list);


       return String.join(" ",list);
    }
}
/*
Given an input string s, reverse the order of the words. A word is defined as a sequence of non-space characters.
The words in s will be separated by at least one space. Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.
 Example 1: Input: s = "the sky is blue" Output: "blue is sky the" Example 2: Input: s = "  hello world  " Output: "world hello" Explanation:
 Your reversed string should not contain leading or trailing spaces. Example 3: Input: s = "a good   example" Output: "example good a" Explanation:
You need to reduce multiple spaces between two words to a single space in the reversed string.
 */