package Basics2;

public class ValidatePin {
    public static void main(String[] args) {


        System.out.println(validate("123456"));
    }

    public static boolean validate(String pin) {

        if (pin.length() != 4 && pin.length()!=6){
            return false;
    }
        for (char c : pin.toCharArray()) {
            if(Character.isLetter(c)){
                return false;
        }
}
        return true;
                }
                }
