package selfStudy6;

public class StringLength {

    public static void main(String[] args) {
        String str1 = "Ermir";

        if(str1.length() >=3){
            System.out.println(str1.substring(0,3));
        }
        if(str1 ==""){
            System.out.println("###");
        }


    }
}
/*
72. Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters.
Test Data: Str1 = " "
Sample Output:

###
 */