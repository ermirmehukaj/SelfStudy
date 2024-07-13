package Basic4;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {
        int [ ] arr1 = {1,5,4,3};

        int [ ] arr2 = {2,3,4,5};

        int [ ] arr3 = new int[arr1.length + arr2.length];

        int j = 0;
        for (int i = 0 ; i < arr1.length; i++) {
            arr3[j++] = arr1[i];
        }
        for (int i = 0 ; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));
    }



}
