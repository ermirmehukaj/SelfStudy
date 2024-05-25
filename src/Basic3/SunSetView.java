package Basic3;

import java.util.ArrayList;
import java.util.Stack;

public class SunSetView {


    public static void main(String[] args) {

        int [ ] array = {3,5,4,4,3,1,3,2};

        sunset(array,"east").forEach(System.out::println);

    }


  public static ArrayList<Integer> sunset(int[] buildings, String direction) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < buildings.length; i++) {
            if (!stack.isEmpty() && buildings[i]>= buildings[stack.peek()]){
                stack.pop();
            }

                stack.push(i);
        }
        return new ArrayList<Integer>(stack);
    }
}
/*

 */