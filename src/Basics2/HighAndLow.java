package Basics2;

public class HighAndLow {

    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
    }
    public static String highAndLow(String str){

        String [] array = str.split(" ");

        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
      for (String str1 : array){
          int num = Integer.parseInt(str1);
          if(num >max){
              max = num;
          }
          if (num < min) {
              min = num;
          }

      }


return max + " " + min;
    }
}
/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
 */