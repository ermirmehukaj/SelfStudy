package Basics2;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;

public class moveZeros {

    public static void main(String[] args) {
        int [] array = {0,1,0,3,12};

        System.out.println(Arrays.toString(move(array)));
    }

    public static int [] move(int [] array){


        int [] array1 = new int[array.length];

        Arrays.sort(array);

        for (int i = array.length - 1, j =0; i >= 0; i--,j++) {

                array1[j] +=array[i];
        }


        return array1;
    }
}
