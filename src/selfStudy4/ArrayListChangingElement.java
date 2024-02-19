package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListChangingElement {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5));
      //  int replace = list.set(4, 0);
        Collections.replaceAll(list,5,0);
        System.out.println(list);


    }
}
   /* write a program that can set the last element of the Integer ArrayList to zero
        ex:
        list = [1,2,3,4,5];

        output:
        [1,2,3,4,0];*/