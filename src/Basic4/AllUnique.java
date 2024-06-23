package Basic4;

import java.util.HashSet;
import java.util.stream.Stream;

public class AllUnique {

    public static void main(String[] args) {

        String str = "ermiri";

        System.out.println(unique(str));
    }


    public static boolean unique(String str) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}


/*
Write a program to determine if a string contains only unique characters. Return true if it does and false otherwise.

The string may contain any of the 128 ASCII characters. Characters are case-sensitive, e.g. 'a' and 'A'
 are considered different characters.
 */