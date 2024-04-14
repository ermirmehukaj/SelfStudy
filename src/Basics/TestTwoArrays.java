package Basics;

public class TestTwoArrays {

    public static void main(String[] args) {
        int [] array = {5,7};

        System.out.println(myArray(array));
    }
    public static boolean myArray(int [] array){

        if(array.length==2 && array[0] ==4 || array[1]==7){
            return true;
        }

        return false;
    }
}

/*
Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.
Sample Output:

Original Array: [5, 7]
true
 */
