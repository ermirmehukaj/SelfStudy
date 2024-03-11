package GroupPractice;

import java.util.Arrays;

public class PositiveInt {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(convertNumber(490)));
    }

    public static int[] convertNumber(int num) {
        int a = 490;
        return Integer.toString(a)
                .chars()
                .map(Character::getNumericValue)
                .toArray();

    }
}
