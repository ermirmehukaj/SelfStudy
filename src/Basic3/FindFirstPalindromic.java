package Basic3;

import java.util.Arrays;

public class FindFirstPalindromic {

    public static void main(String[] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {



        String reverse= "";
        for (int i = words.length - 1; i >= 0; i--) {
            reverse +=words[i].split(" ");
        }

        return reverse;
    }

}
