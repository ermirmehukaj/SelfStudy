package Basic3;

import java.util.ArrayList;
import java.util.List;

public class FindWordContainingCharacter {

    public static void main(String[] args) {
        String [] arr = {"abc","bcd","aaaa","cbc"};
        char ch = 'a';
        System.out.println(findWordsContaining(arr, ch));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
               if(words[i].indexOf(x) != -1){
                   list.add(i);
        }
        }
        return list;
    }
}
