package Basic4;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str = "heart";
        String str1 = "earth";


        char [ ] strArr = str.toCharArray();
        char [ ] strArr1 = str1.toCharArray();

        Arrays.sort(strArr);
        Arrays.sort(strArr1);

        if(Arrays.equals(strArr, strArr1)) {
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }






    }
}
