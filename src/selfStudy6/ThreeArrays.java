package selfStudy6;

import java.util.Arrays;

public class ThreeArrays {
    public static void main(String[] args) {

        int [ ] array1 = {50,-20,0};
        int [ ] array2 = {5,-50,10};

        int [ ] array3 = new int[2];

        array3[0]= array1[0];
        array3[1]=array2[2];
        System.out.println(Arrays.toString(array3));
        


    }
}
/*
Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays.
Test Data: array1 = 50, -20, 0
array2 = 5, -50, 10
Sample Output:

Array1: [50, -20, 0]
Array2: [5, -50, 10]
New Array: [50, 10]
Click me to see the solution
 */