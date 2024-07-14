package Basic4;

public class RemoveDuplicate {

    public static void main(String[] args) {

        String str = "ABCABCABC";

        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
              String ch =  "" + str.charAt(i) ;
              if(str1.contains(ch)){
                  continue;
              }
              str1 += ch;
        }

        System.out.println(str1);

    }
}
