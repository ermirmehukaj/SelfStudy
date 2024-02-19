package selStudy2;

public class MethodString {

    public static void main(String[] args) {
        System.out.println(Capitalized("gEntIanA"));
    }


    public static String Capitalized(String str){

       String result =  str.toUpperCase().substring(0,1) + str.substring(1).toLowerCase();

       return  result;


    }


}
/*

7. Create a method named title that takes a string arguments

    The method returns the proper capitalized version of the given argument

    Ex:
        title("jAvA") ===> Java
 */