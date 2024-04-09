package Generics;

public class MatchNumber {


    public static <T> int match(T[] array, T target) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(target))
                return 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6};
        System.out.println(match(array,2));

        String [] words = {"Java","Python","SQL"};

        System.out.println(match(words,"Java"));
    }
}
/*
. Write a Java program to create a generic method that takes a list of any type and a target element. It returns
the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.
 */