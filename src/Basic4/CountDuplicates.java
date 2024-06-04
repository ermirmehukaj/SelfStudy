package Basic4;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicates("abcde")); // Output: 0
        System.out.println(duplicates("aabbcde")); // Output: 2
        System.out.println(duplicates("aabBcde")); // Output: 2
        System.out.println(duplicates("indivisibility")); // Output: 1
        System.out.println(duplicates("Indivisibilities")); // Output: 2
        System.out.println(duplicates("aA11")); // Output: 2
        System.out.println(duplicates("ABBA")); // Output: 2
    }


    public static int duplicates(String str){
        str = str.toLowerCase();

        Map<Character,Integer> map = new HashMap<>();

      for (Character each : str.toCharArray()){
          map.put(each,map.getOrDefault(each,0)+1);
      }
        int count = 0;

        for (Integer eachValue : map.values()) {
            if(eachValue>1){
                count++;
            }
        }

return count;

    }


}
/*
Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric
digits that occur more than once in the input string. The input string can be assumed to contain only alphabets
(both uppercase and lowercase) and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */