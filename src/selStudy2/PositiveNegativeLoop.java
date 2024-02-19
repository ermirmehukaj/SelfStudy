package selStudy2;

import java.util.Scanner;

public class PositiveNegativeLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num =0;
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter e number");
            num = input.nextInt();
            if(num>=0){
            positive++;

              }else {
            negative++;
            }}

          System.out.println(positive + " positive numbers and " + negative + " negative numbers");




    }
}
/*
 Create a class named PositiveNegative and write a program that asks the user to enter a number for 5 times, and print how many positive and negative numbers the user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative

 */