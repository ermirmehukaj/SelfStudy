package selfStudy6;

public class ArrayElements {
    public static void main(String[] args) {

        int[] arr = {50, -20, 0, 30, 40, 60, 10};

        boolean result = arr[0] == arr[arr.length - 1];

        System.out.println(result);



    }
}
/*75. Write a Java program to test if the first and last elements of an array of integers are the same. The array length must be broader than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:

false*/