package Basics2;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println(count(str));
    }



    static Map<Character,Integer> count(String str){
        Map<Character,Integer> map = new HashMap<>();


        for (Character each : str.toCharArray()){
            map.put(each,map.getOrDefault(each,0)+1);
        }
        return map;
    }
}
/*
The main idea is to count all the occurring characters in a string.
 If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.
 */