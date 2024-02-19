package SelfStudy5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CandyFactory {
    public static void main(String[] args) {


        ArrayList<Candy> candies = new ArrayList<>();
        Candy candy1 = new Candy("Milka",4,1.5,false);
        Candy candy2 = new Candy("Milka-Strawberry",2,1.7,false);

         candies.addAll(Arrays.asList(candy1,candy2));

        for (Candy each : candies) {
            System.out.println(each.getBrand() + " : " + each.getPrice() +  " -> " + each.calcPrice());
        }

        System.out.println(candies);
    }
}