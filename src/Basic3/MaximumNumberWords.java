package Basic3;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumNumberWords {

    public static void main(String[] args) {
        String [] sentence = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentence));
    }

    public static int mostWordsFound(String[] sentences) {
//      return (int) Arrays.stream(sentences).mapToInt(sentence -> sentence.split(" ").length)
//                .max()
//                .orElse(0);

        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            String [] str = sentences[i].split(" ");
            if(str.length>count){
                count=str.length;
            }
        }
        return count;

    }
}
/*
A sentence is a list of words that are separated by a single space with no leading or trailing spaces.

You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.
 */