package selfStudy3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MaxMinArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        int max = 0;
        int min = list.get(0);

        for (Integer each : list) {
            if(each>max){
                max=each;
            }else {
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}

/*
Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */