package Basic4;

public class ReverseIfIsMoreThanFive {


    public static void main(String[] args) {

        String str = "Hey fellow warriors";

        System.out.println(reverse(str));
    }

    public static String reverse(String s) {

        String[] str = s.split(" ");
        String str1 = "";
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= 5) {
                str1 += new StringBuilder(str[i]).reverse().toString();
            }else {
                str1 += str[i] ;
            }
            str1 += " ";
        }
        return str1.trim();
    }

}
//Write a function that takes in a string of one or more words,
// and returns the same string, but with all words that have five or more letters reversed (Just like the name of this Kata).
// Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
//
//Examples:
//
//        "Hey fellow warriors"  --> "Hey wollef sroirraw"
//        "This is a test        --> "This is a test"
//        "This is another test" --> "This is rehtona test"