package Basic4;

public class SecondMaximum {


    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 3, 5, 8};

        System.out.println(num(arr));
    }


    public static int num(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > secondMax && arr[j] < max) {
                    secondMax = arr[j];
                }
            }
        }

        return secondMax;


    }
}
