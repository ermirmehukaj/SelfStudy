package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveAllMatching {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));
        System.out.println(list);

         list.removeIf(p->p.equalsIgnoreCase("ahmed"));
        System.out.println(list);
    }
}


/*
 Write a program that can remove all the names "Ahmed" from an ArrayList of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];

 */