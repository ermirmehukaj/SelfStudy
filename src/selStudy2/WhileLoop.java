package selStudy2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
String str = "";
        System.out.println("Will you marry me?");
       str = input.next();

        if(str.equals("yes")){
            System.out.println("Congrats");
        }
        if(str.equals("no")){
            System.out.println("Goodbye");
        }

        while (!(str.equals("yes")||str.equals("no"))){
            System.out.println("Invalid answer, please re-enter");
           str = input.next();
        }
    }
}
/*
1.  Create a class named Marriage Proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */