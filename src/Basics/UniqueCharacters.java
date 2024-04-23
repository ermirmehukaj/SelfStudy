package Basics;

public class UniqueCharacters {


    public static void main(String[] args) {
        String str = "aabccdee";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch )== str.lastIndexOf(ch)){
                unique += ch;
            }
        }
        System.out.println(unique);
    }
}
