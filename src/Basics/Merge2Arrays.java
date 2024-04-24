package Basics;

import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {


        int [] array = {10,20,30};
        int [] array2 = {12,33,33,22,44};
        
        int[] arra3 = new int[array2.length + array.length];

        int i = 0;
       for (int each : array) {
           arra3[i++] = each;
       }

        for (int each : array2) {
            arra3[i++] = each;
        }

        System.out.println(Arrays.toString(arra3));
                }

            }

