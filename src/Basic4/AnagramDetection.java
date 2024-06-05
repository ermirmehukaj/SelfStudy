package Basic4;

import java.util.Arrays;

public class AnagramDetection {

    public static void main(String[] args) {

        String str = "foefet";

        String str1 = "toffee";

        System.out.println(isAnagram(str,str1));


    }



    public static boolean isAnagram(String str , String str1){


       char [] ch1 = str.toLowerCase().toCharArray();
        char [] ch2 = str1.toLowerCase().toCharArray();


        Arrays.sort(ch1);
        Arrays.sort(ch2);



        return Arrays.equals(ch1,ch2);
    }
}
