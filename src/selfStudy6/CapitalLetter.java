package selfStudy6;

import java.util.Arrays;

public class CapitalLetter {
    public static void main(String[] args) {

        String str = "the quick brown fox jumps over the lazy dog";

        String [] str1 = str.split(" ");
         String result = "";
        for (String each : str1) {
            result +=each.toUpperCase().charAt(0) + each.substring(1) + " ";
        }
        System.out.println(result);
    }
}
   /* Write a Java program to capitalize the first letter of each word in a sentence.
        Sample Output:

        Input a Sentence: the quick brown fox jumps over the lazy dog.
        The Quick Brown Fox Jumps Over The Lazy Dog.*/