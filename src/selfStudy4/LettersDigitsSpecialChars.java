package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {


        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> list = new ArrayList<>();


        ArrayList<Character> list1 = new ArrayList<>();


        ArrayList<Character> list2 = new ArrayList<>();

        for (char each :str.toCharArray()){
            if(Character.isLetter(each)){
                list.addAll(Arrays.asList(each));
            } else if (Character.isDigit(each)) {
                list1.addAll(Arrays.asList(each));
            }else {
                list2.addAll(Arrays.asList(each));
            }
        }

        System.out.println("list = " + list);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);


    }
}


   /* Write a program that can extract the special characters, digits, and letters from a string and store them into separate ArrayLists of Characters
        Ex:
        str = "ABCD123$%#@&456EFG!"

        output:
        list1: {1, 2, 3, 4, 5, 6}
        list2: {A, B, C, D, E, F, G}
        list3: {$, %, #, @, &, !}*/
