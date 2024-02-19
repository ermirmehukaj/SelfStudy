package selfStudy01;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {


        String word = "Xcodex";
         String aa = word.replaceAll("[xX]", "a");;

        System.out.println(aa);

    }
}


/*3. Create a class named ReplaceX, and write a program that asks the user to enter a word. and replace all the x or X with the character a
        Input:
        xcodeX
        Output:
        acodea*/