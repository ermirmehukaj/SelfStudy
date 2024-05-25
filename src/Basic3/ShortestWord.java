package Basic3;

import java.util.stream.Stream;

public class ShortestWord {

    public static void main(String[] args) {
        System.out.println(length1("Ermiri osht shume i fort"));
    }
    
    
    public static int length1(String words){
        int min = Integer.MAX_VALUE;
        for(String each : words.split(" "))
        {
            if(each.length() < min)
                min = each.length();
        }
        return min;
    }
}
/*
Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.
 */