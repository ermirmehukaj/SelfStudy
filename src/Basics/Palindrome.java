package Basics;

public class Palindrome {

    public static void main(String[] args) {



        String palindrome = "LeveL";

        String reverse = "";

        for (int i = palindrome.length()-1; i >= 0; i--) {
                  reverse += palindrome.charAt(i);
        }
          if(palindrome.equalsIgnoreCase(reverse)){
              System.out.println("palindrome");
          }else {
              System.out.println("not palindrome");
          }



    }
}
