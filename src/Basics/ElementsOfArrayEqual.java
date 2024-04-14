package Basics;

public class ElementsOfArrayEqual {


    public static void main(String[] args) {
        int[] myArray = {50, -20, 0, 30, 40, 60, 60};

        System.out.println(array1(myArray));

    }


    public static boolean array1(int[] myArray) {
        if (myArray.length > 2) {
            return myArray[0] == myArray[myArray.length - 1];
        }


        return false;
    }}
/*
75. Write a Java program to test if the first and last elements of an array of integers are the same.
The array length must be broader than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false

 */