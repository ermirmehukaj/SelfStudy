package selStudy2;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str = "bcabc";
        String result = "";


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ch){
                    frequency++;
                }
            }
            if(frequency == 1){
                result +=ch;
            }
        }

        System.out.println(result);

    }
    }

  /*  Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

        Ex:
        str = "aabccdeef";

        output:
        bdf*/