package selfStudy7;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Generics {


            public static <T> void swap(T[] array, int index1, int index2) {
                if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
                    throw new IllegalArgumentException("Invalid indices");
                }

                T temp = array[index1];
                  array[index1] = array[index2];
                  array[index2] = temp;
            }

            public static void main(String[] args) {
                Integer[] a = {1, 2, 3, 4};
                swap(a, 0, 2);
                System.out.println(Arrays.toString(a)); // [3, 2, 1, 4]
            }
        }


