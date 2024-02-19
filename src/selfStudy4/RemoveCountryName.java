package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveCountryName {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        
        list.addAll(Arrays.asList("Germany","Switzerland","Kosovo"));
        
        list.removeIf(p-> p.length()>10);
        System.out.println("list = " + list);
        
        
        
    }
}
