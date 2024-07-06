package Basic4;

public class ReverseString {

    public static void main(String[] args) {
        String s = "Java programming";
        System.out.println(reverseString(s));
    }

    public static String reverseString(String str) {
        String str1 = "";

        for (int i = str.length()-1; i >=0; i--) {
            str1 += str.charAt(i);
        }

        return str1;
    }
}
