package GroupPractice;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {


            int[] array = {0, 1, 0, 3, 12};
            int[] result = moveZerosToEnd(array);
            System.out.println(Arrays.toString(result));
        }

        public static int[] moveZerosToEnd(int[] array) {
            return Arrays.stream(array)
                    .boxed()
                    .sorted((a, b) -> a == 0 ? 1 : b == 0 ? -1 : 0)
                    .mapToInt(Integer::intValue)
                    .toArray();
        }


}
/*
Question-1 Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0, 1, 0, 3, 12] Output: [1, 3, 12, 0, 0]
Example 2:
Input: nums = [0] Output: [0]
Constraints:
• 1 <= nums.length <= 104
• -2
31 <= nums[i] <= 231
- 1
 */