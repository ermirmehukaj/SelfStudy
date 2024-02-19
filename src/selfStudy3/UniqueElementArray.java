package selfStudy3;

public class UniqueElementArray {
    public static void main(String[] args) {

        int [] array1 = {1,2,3,1,2,4,5,6,5,6,3,7,8,9};


        for (int each : array1) {
            int frequency = 0;
            for (int eachElement : array1) {
                if(each==eachElement){
                    frequency++;
                }
            }
            if(frequency==1){
                System.out.println(each);
            }
        }




    }
}
   /* Write a program that can display the unique elements of an array

    MUST use for each loop*/