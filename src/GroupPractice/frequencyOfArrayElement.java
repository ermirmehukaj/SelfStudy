package GroupPractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class frequencyOfArrayElement {

    public static Map<String, Integer> frequencyOfArray(String[] array) {

        Map<String, Integer> map = new HashMap<>();

        for (String each : array) {
            String lowercaseElement = each.toLowerCase();

            Integer count = map.get(lowercaseElement);

            if (count == null) {
                map.put(lowercaseElement, 1);
            } else {
                map.put(lowercaseElement, count + 1);
            }

        }
        return map;
    }

    public static void main(String[] args) {

        String[] str = {"Apple", "Banana", "apple", "Cherry", "Apple"};

        System.out.println(frequencyOfArray(str));
    }
}
