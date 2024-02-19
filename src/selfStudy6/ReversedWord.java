package selfStudy6;

import java.util.Scanner;

public class ReversedWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = input.next();




        char[] ch = word.toCharArray();
        String result = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }

        System.out.println(result);


        String word1 = "dsaf";
        System.out.println(word1);

        String reversed1 = "";
        for (int i = word1.length() -1 ; i >= 0; i--) {
            reversed1 +=word1.charAt(i);
        }
        System.out.println(reversed1);
    }

}


/*Write a Java program to reverse a word.
        Sample Output:

        Input a word: dsaf
        Reverse word: fasd*/