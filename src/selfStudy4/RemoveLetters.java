package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLetters {
    public static void main(String[] args) {


        ArrayList<Character> letters = new ArrayList<>();

        letters.addAll(Arrays.asList('$','A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        letters.removeIf(p->Character.isLetter(p));
        System.out.println(letters);
    }
}
   /* Write a program that can remove all the letters from an ArrayList of characters
		ex:
                list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

        output:
        ['$',  '1', '2', '@', '!', '3', '4']*/