package selfStudy7;

import java.util.Arrays;

public class StringReverse {


    public static void main(String[] args) {



        String str = " The quick brown fox jumps over the lazy dog";

      String [] str1= str.split(" ");
String reversed = "";
        for (int i = str1.length -1; i >= 0; i--) {
            reversed += str1[i] +" " ;
        }

        System.out.println(reversed);
    }
}
