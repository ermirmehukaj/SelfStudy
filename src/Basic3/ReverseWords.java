package Basic3;

public class ReverseWords {

    public static void main(String[] args) {


        System.out.println(reversee("This is an example!"));
    }





    public static String reversee(String str){

        String result = "";

        for (int i = str.length()-1; i > 0; i--) {
            result += str.charAt(i);
        }
        return result;

    }
}
