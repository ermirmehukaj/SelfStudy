package Basic3;

import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumbers {

    public static void main(String[] args) {
        int[] candie = {1, 3, 5, 1, 3};
        int extraCadies = 2;
        System.out.println(kidsWithCandies(candie, extraCadies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }}
            for (int j = 0; j < candies.length; j++) {
                if (candies[j] + extraCandies >= max) {
                    list.add(true);
                } else {
                    list.add(false);
                }
            }


        return list;

    }
}
/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids,
 or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */