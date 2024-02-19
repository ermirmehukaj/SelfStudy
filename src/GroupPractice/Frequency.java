package GroupPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Frequency {

    public static Map<Character,Integer> frequencyOfCharacter(String str){
        if(str==null){
            return null;
        }
        Map<Character,Integer> frequency1 = new LinkedHashMap<>();

        if(str.isEmpty()){
            return frequency1;
        }


        for (char eachChar : str.toCharArray()) {
            frequency1.put(eachChar, frequency1.getOrDefault(eachChar,0)+1);
        }
        return frequency1;
    }


    public static void main(String[] args) {
        System.out.println(frequencyOfCharacter(""));
    }
}


