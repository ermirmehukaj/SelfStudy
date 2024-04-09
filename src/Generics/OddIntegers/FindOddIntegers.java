package Generics.OddIntegers;

import java.util.*;

public class FindOddIntegers {


    public static <T> int intCountIf(Collection<T> collections, UnaryPredicate<T> unaryPredicate) {

        int count = 0;

        for (T element : collections){
            unaryPredicate.test(element);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5);

        System.out.println(intCountIf(list,new OddPredicate()));
    }

}
