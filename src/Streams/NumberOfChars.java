package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfChars {

    public static void main(String[] args) {



        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .map(a ->a.length())
                .forEach(System.out::println);


    }
}


/*
Given a list of words, print the number of characters for each word.
        List<String> words = Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");
 */