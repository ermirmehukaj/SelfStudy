package Basic4;

public class DisemvowelTrolls {
    public static void main(String[] args) {

        String str = " This website is for losers LOL!";
        System.out.println(vowel(str));
    }


    public static String vowel(String str) {

//        String output="";
//
//        for (int i = 0; i < str.length(); i++) {
//
//            if (str.charAt(i) != 'a' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != 'e' && str.charAt(i)!='O'){
//
//            output = output + str.charAt(i);
//        }}
//        return output;
        // }

        return str.replaceAll("[aAeEiIoOuU]","");
    }
}