package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();

       list1.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list1);

        list1.addAll(list1);
        System.out.println("list1 = " + list1);


    }

}


/*
Write a program that can duplicate the elements of an ArrayList
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];
 */