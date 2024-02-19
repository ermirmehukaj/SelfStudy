package selfStudy01;

public class OxygenTank {

    public static void main(String[] args) {

        int oxygen = 50;
        String result = "";

       result= (oxygen==90)? "Your tank is full":(oxygen==80)? "Still okey":(oxygen==70)? "Dont go too far": (oxygen==60)? "Start to head back": (oxygen==50)? "Be careful now you at at 50%": "Invalid";

        System.out.println(result);

    }
}
