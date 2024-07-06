package Basic4;

public class Palindrome {


    public static void main(String[] args) {
        String s = "Levela";
        System.out.println(isPalindrome(s));
    }
    public static String  isPalindrome(String str) {
        str = str.toLowerCase();
        String str1 = "";
        for (int i = str.length() -1; i >=0 ; i--) {
            str1 += str.charAt(i);
        }
        if (str1.equals(str)) {
            return "Palindrome";
        }
        return "Not a palindrome";
    }
}
