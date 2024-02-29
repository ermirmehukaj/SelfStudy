package selfStudy7;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {


        int [] a1 = {45,67,32,89,76};

        Arrays.sort(a1);

        int index = a1.length - 1;


       if (a1[index] == a1[a1.length - 1]) {
            index--;
        }

        System.out.println(a1[index]);




    }
}
