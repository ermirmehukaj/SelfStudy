package Basic4;

import java.util.stream.Stream;

public class NumberOfDecimal {

    public static void main(String[] args) {

        System.out.println(number(66666));
    }


    public static int number(int n1){
//        String str = String.valueOf(n1);
//          int count=0;
//        for (int i = 0; i < str.length(); i++) {
//         //   char ch = str.charAt(i);
//            count++;
//        }
//        return count;

      return   String.valueOf(n1).length();
    }
}
