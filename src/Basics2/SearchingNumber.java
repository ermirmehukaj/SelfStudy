package Basics2;

public class SearchingNumber {

    public static void main(String[] args) {


        int [ ] array = {9, 7, 2, 16, 4};
        System.out.println(number(array));
    }

    public static int number(int [] array){

        int k = 16;

        for (int i = 0; i < array.length; i++) {

            if(k == array[i]){
                return i+1;
            }
        }
        return -1;
    }
}
