package selfStudy3;

import java.util.Arrays;

public class ReverseOneWord {
    public static void main(String[] args) {

        String sentence = "I Love Java";

        String [] str =sentence.split("");

        System.out.println(Arrays.toString(str));
String reversed = "";
        for (int i = str.length - 1; i >= 0; i--) {
            reversed+=str[i];
            }
        System.out.println(reversed);


        }

    }

/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */