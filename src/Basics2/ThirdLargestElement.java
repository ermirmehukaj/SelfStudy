package Basics2;

public class ThirdLargestElement {
    public static void main(String[] args) {

        int[] y = {2, 4, 1, 3, 5};

        System.out.println(thidElement(y));
    }

    public static int thidElement(int[] array) {
        int largestNumber = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (largestNumber < array[i]) {
                largestNumber = array[i];
            }
        }
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (secondLargest < array[i] && array[i] < largestNumber) {
                secondLargest = array[i];
            }


        }
        int thirdLargest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (thirdLargest < array[i] && array[i] < secondLargest) {
                thirdLargest = array[i];
            }

        }
        return thirdLargest;
    }
}

