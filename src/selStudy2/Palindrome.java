package selStudy2;

public class Palindrome {
    public static void main(String[] args) {

        String str = "ana";

        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse +=  str.charAt(i);


        }

if(reverse.equals(str)){
    System.out.println("true");
}else {
    System.out.println("false");
}


    }
}
