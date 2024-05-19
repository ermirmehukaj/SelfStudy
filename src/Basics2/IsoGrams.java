package Basics2;

import java.util.HashSet;
import java.util.Set;

public class IsoGrams {

    public static void main(String[] args) {
        String str = "ana";

        System.out.println(isogram(str));
    }

    static boolean isogram(String str){




      // return str.toLowerCase().chars().distinct().count()==str.length();

        Set<Character> letters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
         if(letters.contains(str.toLowerCase().charAt(i))){
             return false;
         }
         letters.add(str.charAt(i));
        }
return true;

    }
}
/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
 Assume the empty string is an isogram. Ignore letter case.

 "Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)
 */