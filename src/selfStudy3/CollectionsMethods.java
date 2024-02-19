package selfStudy3;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethods {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";
String result = "";
String isDigiti = "";
String specialChar = "";

        for (char c : str.toCharArray()) {
            if(Character.isLetter(c)){
                result +=c;
            }
            if (Character.isDigit(c)){
                isDigiti+=c;
            }
            if( !Character.isLetterOrDigit(c)){
                specialChar+=c;
            }
        }

        System.out.println(result);
        System.out.println(isDigiti);
        System.out.println(specialChar);

    }
}
   /* Write a program that can retrieve the letters, digits, and special characters from the string
        Ex:
        str = "Wooden Spoon!"

        output:
        letters= "WoodenSpoon";
        Digits = "";
        specialChars = " !";

        Note: Use Wrapper class methods*/