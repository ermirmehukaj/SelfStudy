package selfStudy7;

public class Common {

    public static void main(String[] args) {


        int [ ] array1 = {1,2,3,4,5};
        int [ ] array2 = {4,5,6,7,8};

        for (int i : array1) {
            for (int i1 : array2) {
                if (i == i1){
                    System.out.println(i);
                }
            }
        }



    }
}
