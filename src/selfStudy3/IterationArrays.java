package selfStudy3;

import java.util.Arrays;

public class IterationArrays {


    public static void main(String[] args) {

        String[] array = {"java","Python","C#"};

        for (int i = 0; i < array.length; i++) {
            String name = array[i];
            String reverse="";
            for (int j = name.length()-1; j >=0 ; j--) {
                reverse+=name.charAt(j);
            }
            System.out.println(reverse);
        }
    }
}
/*
create a string array, and store the names of your classmates (10)
            reverse each student's names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */