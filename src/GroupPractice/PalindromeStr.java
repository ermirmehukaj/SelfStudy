package GroupPractice;

public class PalindromeStr {

    public static void main(String[] args) {



        boolean isPalindrome = palindrome(" ");
        System.out.println(isPalindrome);

    }




    public static boolean palindrome(String str){
        str = str.toLowerCase().replaceAll(" ", "");
 String reverse = "";

        for (int i=str.length()-1; i>=0; i--) {
            reverse += str.charAt(i);
        }
        return reverse.equals(str);
    }




}
