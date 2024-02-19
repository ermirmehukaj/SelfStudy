package selStudy2;

public class Method3 {


    public static void main(String[] args) {


        System.out.println(combine("java","apple"));
    }

    public static String combine(String str1,String str2){


        if (str1.charAt(str1.length()-1) == str2.charAt(0)){
            return str1.substring(0,str1.length()) + str2.substring(1);
        }else {
            return str1 + str2;
        }
    }
}

/*
5.  Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
    Ex:
        combine("one", "eight")  ==> oneight
 */