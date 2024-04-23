package Basics;

public class RemoveDuplictaesStrings {


    public static void main(String[] args) {

        String str = "ABCABCABC";

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(result.contains(ch  +"")){
                continue;
            }
            result+=ch;
        }
        System.out.println(result);
    }
}
