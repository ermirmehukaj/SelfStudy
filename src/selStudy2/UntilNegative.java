package selStudy2;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        System.out.println("Enter a number (enter a negative number to stop):");
        number = scanner.nextInt();

        while (number >= 0) {
            sum += number;

            System.out.println("Enter another number (enter a negative number to stop):");
            number = scanner.nextInt();
        }

        System.out.println("Sum of positive numbers entered: " + sum);

        scanner.close();


    }
}
   /* Create a class named UntilNegative and Write a program that calculates the sum of numbers
    entered by the user until the user enters a negative number.
    */