package selfStudy7;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveNumberFromTheList {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        System.out.println(list);

list.remove(3);
        System.out.println(list);

    }
}
