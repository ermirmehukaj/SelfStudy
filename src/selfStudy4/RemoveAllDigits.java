package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDigits {

    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();

        chars.addAll(Arrays.asList('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        chars.removeIf(p->Character.isDigit(p));
        System.out.println(chars);

    }
}
/*
Write a program that can remove all the digits from an ArrayList of characters
		ex:
			list = {'$', A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'}

		output:
			['$', A', 'B', 'C', 'D', '@', '!']

 */