package Basic4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

    public static void main(String[] args) {
        String str= "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";


        System.out.println(remove(str));
    }




    public static String remove(String str ){

       return Arrays.stream( str.split(" ")).distinct().collect(Collectors.joining(" ") );

    }
}
