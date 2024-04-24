package Basics;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arra={10,5,30,15,0};

        int [] reverseArray = new int[arra.length];

        for (int i = arra.length - 1,j=0; i >= 0; i--,j++) {
           reverseArray[j] = arra[i];
        }

        System.out.println(Arrays.toString(reverseArray));
    }
}
