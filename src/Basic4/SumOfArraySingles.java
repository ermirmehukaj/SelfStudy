package Basic4;

import java.util.HashMap;
import java.util.Map;

public class SumOfArraySingles {


    public static void main(String[] args) {
       int [] array = {4,5,7,5,4,12};

        System.out.println(suming(array));



    }


    public static int suming(int[] arr) {

        Map<Integer, Integer> freq = new HashMap<>();
        int sum = 0;
        for (int each : arr) {
            freq.put(each, freq.getOrDefault(each, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> eachEntry : freq.entrySet()) {
            if (eachEntry.getValue() == 1) {
                sum += eachEntry.getKey();
            }
        }
        return sum;
    }
}
