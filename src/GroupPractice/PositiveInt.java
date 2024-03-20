package GroupPractice;

import java.util.Arrays;

public class PositiveInt {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(convertNumber(490)));
    }

    public static int[] convertNumber(int num) {

        return Integer.toString(num)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

    }
}
