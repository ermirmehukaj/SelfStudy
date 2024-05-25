package Basic3;

public class FindParityOutlier {

    public static void main(String[] args) {

        int [] nums ={2, 4, 0, 100, 4, 11, 2602, 36};

        System.out.println(numb(nums));
    }


    public static int numb(int[] arr) {


        for (int i = 0; i < arr.length; i++) {
            int odd = arr[i];
            if(odd % 2 !=0) return odd;
        }
      return 0;
    }

}
/*

You are given an array (which will have a length of at least 3, but could be very large) containing integers.
 The array is either entirely comprised of odd integers or entirely comprised of even integers except for a single integer N.
 Write a method that takes the array as an argument and returns this "outlier" N.

Examples
[2, 4, 0, 100, 4, 11, 2602, 36] -->  11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21] --> 160 (the only even number)
 */