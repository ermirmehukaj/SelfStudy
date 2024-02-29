package GroupPractice;

public class Practice {


    public static void main(String[] args) {

        int [] array1 = {1,2,3,4,5};
        System.out.println(array(array1));

    }

    public static Integer array(int[] a1) {

        if(a1== null || a1.length== 0){
            return null;
        }

        int max = Integer.MIN_VALUE;


        for (int j : a1) {
            if (j > max) {
                max = j;
            }


        }
        return max;


    }
}