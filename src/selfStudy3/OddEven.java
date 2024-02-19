package selfStudy3;

public class OddEven {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,7};

        int countEven = 0;
        int countOdd = 0;

        for (int each : array) {
            if(each %2 !=0){
                countOdd++;
            }else {
                countEven++;
            }
        }

        System.out.println(countEven);
        System.out.println(countOdd);


    }
}


 /*   Write a program that can count the even and odd numbers from an array of integers

			Note: MUST use for each loop*/