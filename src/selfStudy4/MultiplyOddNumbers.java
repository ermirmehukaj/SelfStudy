package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;

public class MultiplyOddNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5));
        for (Integer each : list2) {
            if(each %2 !=0){
                int numbers =each*2;
                System.out.println(numbers);
            }


        }



        }



    }

/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]
 */