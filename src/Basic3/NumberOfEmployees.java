package Basic3;

import java.util.Arrays;

public class NumberOfEmployees {

    public static void main(String[] args) {


        int [] hours = {0,1,2,3,4};
        int target = 3;
        System.out.println(numberOfEmployeesWhoMetTarget(hours, target));
    }

    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;

        for (int i = 0; i < hours.length; i++) {
           if(hours[i] >= target){
               count++;
           }
        }
return count;
    }
}

/*
There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.

The company requires each employee to work for at least target hours.

You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.

Return the integer denoting the number of employees who worked at least target hours.
 */
