package GroupPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class GreaterThan {

    public static void main(String[] args) {
        int [ ] arr= {10, 4, 6, 3, 5};

        System.out.println(find(arr));
    }

    public static List<Integer> find(int [] array){


        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = array.length - 1; i >= 0; i--) {
            int nums = array[i];

            while (!stack.isEmpty() && nums >stack.peek()){

                stack.pop();
            }
            if(stack.isEmpty() || nums>stack.peek()){
                list.add(nums);
            }
            stack.push(nums);
        }
        Collections.reverse(list);
        return list;
    }
}
