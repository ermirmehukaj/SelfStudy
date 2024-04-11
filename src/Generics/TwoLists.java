package Generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoLists {

    public static <T> List<T> reverse(List<T> list1){

        List<T> reversedList = new ArrayList<>();

        for (int i = list1.size() - 1; i >= 0; i--) {
            reversedList.add(list1.get(i));

        }
        return reversedList;
    }


    public static void main(String[] args) {
        System.out.println(reverse(Arrays.asList(1,4,6,7,8)));
    }

}
/*
Write a Java program to create a generic method that takes a
list of any type and returns it as a new list with the elements in reverse order.
 */