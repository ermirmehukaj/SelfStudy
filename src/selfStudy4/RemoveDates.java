package selfStudy4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {
    public static void main(String[] args) {

            ArrayList<LocalDate> list = new ArrayList<>();
            list.addAll(Arrays.asList(
                    LocalDate.of(2014, 5, 30)
            ));

            list.removeIf(p -> p.isBefore(LocalDate.of(2016, 8, 15)));

            System.out.println(list);
        }

    }


/*
create an Arraylist of LocalDate, write a program that can remove all the dates before August-15-2016
 */