package selfStudy4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class RemoveSecondMaximum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        list.removeIf(p->p == Collections.max(list) || p == Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

    }
}
