package Basic4;

public class Arithmetic {

    public static void main(String[] args) {

        System.out.println(nums(5,2,"add"));
    }


    public static int nums(int n1, int n2, String operator){

        if(operator.equals("add")){
            return n1+n2;
        }else if (operator.equals("subtract")){
            return n1-n2;
        }else if (operator.equals("multiply")){
            return n1*n2;
        }else if (operator.equals("devide")){
            return n1/n2;
        }else {
            return 0;
        }

    }
}
