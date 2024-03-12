package GroupPractice;

public class LargerNumber {

    public static void main(String[] args) {

      int[] array1 =  {20, 30, 40, 50, 67};

      int max = Integer.MIN_VALUE;

        if (max <= array1[array1.length - 1])
            max = array1[array1.length - 1];

        // Check if the middle element is greater than max_val
        if (max <= array1[array1.length / 2])
            max = array1[array1.length / 2];

        System.out.println("Largest element between first, last, and middle values: "  + max);
    }
}
