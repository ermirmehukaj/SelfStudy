package selfStudy3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {
       String [] arr1 = {"A", "B", "C"};
     String[]   arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();
      list.addAll(Arrays.asList(arr1));
      list.addAll(Arrays.asList(arr2));


        System.out.println(list);





    }
}


/*
 write a program that can combine two String arrays into one ArrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */