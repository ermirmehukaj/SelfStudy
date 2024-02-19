package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElementsArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list.removeIf(p -> Collections.frequency(list,p)>1);
        System.out.println(list);
    }
}

/*
Write a program that can display the unique elements of an ArrayList:
		ex:
			list = [1, 1, 2, 3, 3, 4, 5, 5]

		output:
			[2, 4]

	Note: DO NOT use any loops
 */