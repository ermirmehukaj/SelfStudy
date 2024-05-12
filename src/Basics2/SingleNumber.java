package Basics2;

import java.util.HashSet;

public class SingleNumber {

    public static void main(String[] args) {
        int [] arraaay = {1,2,2,1,5};

        System.out.println(single(arraaay));
    }


    public static int single(int [ ] array){
        HashSet<Integer> set = new HashSet<>();

        for (int each : array) {
            if(set.contains(each)){
                set.remove(each);
        }else {
                set.add(each);
            }

        }
        return set.iterator().next();
    }
}
