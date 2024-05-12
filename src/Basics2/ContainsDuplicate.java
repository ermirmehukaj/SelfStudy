package Basics2;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        System.out.println(contains(arr));

    }
    
    public static boolean contains(int [ ] array){

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]) return true;
            }
        }
        return false;
    }
}
