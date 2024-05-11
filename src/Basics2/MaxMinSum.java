package Basics2;

public class MaxMinSum {

    public static void main(String[] args) {


        int [ ] arr = {1, 3, 4, 1};

        System.out.println("Sum = " + sum(arr) );
    }


    public static int sum(int [] arr){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
            }
            if (max<arr[i]){
                max=arr[i];
            }
        }

        return  max + min;
    }
}
