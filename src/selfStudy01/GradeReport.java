package selfStudy01;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter your score: ");

        int score = input.nextInt();


        if (score > 0 && score < 100) {
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 70) {
                grade = 'B';
            } else if (score >= 65) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else if (score >= 50) {
                grade = 'F';

                System.out.println(grade);
            } else {
                System.out.println("You didnt pass the exam");


            }
        }



        }

    }
