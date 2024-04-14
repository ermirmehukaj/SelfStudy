package Basics;

public class FrequencyArray {

    public static void main(String[] args) {
        int[] array = {10, 20, 10, 20, 30, 40, 40, 30, 50};

        System.out.println(number(array));
    }

    public static int number(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return array[i];
            }
        }
        return -1; // If no single number found
    }



}
/*
129. Write a Java program to find a number that appears only once in a given array of integers.
All numbers occur twice.
Source Array : [10, 20, 10, 20, 30, 40, 40, 30, 50] 50 appears only once
 */