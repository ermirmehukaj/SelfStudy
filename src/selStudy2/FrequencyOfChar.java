package selStudy2;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String str = "aabcccd";
        char ch= 'c';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)){
                frequency++;
            }
        }
        System.out.println( frequency);



    }
}
  /*  Create a class named FrequencyOfChar and Write a program that asks the user to enter a string and a char, which returns the frequency of the char from the given string
        Ex:
        inputs:
        str = "aabcccd";
        char = 'c';

        output: 3

        inputs:
        "Java programming language"
        'g'

        output: 4*/