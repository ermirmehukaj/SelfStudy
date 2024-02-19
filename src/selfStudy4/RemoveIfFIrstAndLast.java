package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfFIrstAndLast {
    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();
        lista.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));
        
        lista.removeIf(p->p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));
        System.out.println("lista = " + lista);
        
        
        
        
        

    }
}
/*
Write a program that can remove string elements from an ArrayList if the first and last characters of the string are the same
	ex: 
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		["Lan", "Ebrahim", "Farida"]
 */