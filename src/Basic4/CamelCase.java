package Basic4;

public class CamelCase {

    public static void main(String[] args) {


        String str = "camelCasing";
        System.out.println(toCamelCase(str));
    }


    public static String toCamelCase(String s) {


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);

        if(Character.isUpperCase(c) && i > 0){
              sb.append(" ");
        }
          sb.append(c);
        }
        return sb.toString();
    }
}


/*
Complete the solution so that the function will break up camel casing, using a space between words.

Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
 */