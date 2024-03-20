package GroupPractice;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t){

        if(s.length() != t.length()){
            return false;
        }

        char[] ch = s.toCharArray();

        char[] ch1 = t.toCharArray();


        Arrays.sort(ch);
        Arrays.sort(ch1);

        return Arrays.equals(ch,ch1);
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));
    }


}
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Constraints:
 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
such a case?
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */