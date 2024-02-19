package selfStudy01;

public class Calculator {

    public static void main(String[] args) {

        int num1 = 6;
        int num2 = 70;

        char mathOperator = '%';
        double result = 0;

        if(mathOperator == '-'){
            result = num1-num2;
        }
        if(mathOperator == '+'){
            result=num1 + num2;
        }
       if(mathOperator == '*'){
           result=num1 * num2;
       }if(mathOperator =='/'){
            result=num1 / num2;
        }
      if (mathOperator !='-' || mathOperator !='+' || mathOperator!='*'||mathOperator!= '/'){
          System.out.println("Invalid operator");
      }

    }
}
