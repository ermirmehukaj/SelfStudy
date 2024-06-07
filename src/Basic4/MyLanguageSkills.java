package Basic4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyLanguageSkills {
    public static void main(String[] args) {


        Map<String, Integer> test1 = Map.of("Java", 10, "Ruby", 80, "Python", 65);
        Map<String, Integer> test2 = Map.of("Hindi", 60, "Dutch", 93, "Greek", 71);
        Map<String, Integer> test3 = Map.of("C++", 50, "ASM", 10, "Haskell", 20);

        System.out.println(language(test1));

    }
    public static List<String> language(Map<String,Integer> map){
        List<String> result = new ArrayList<>();


        map.entrySet().stream()
                .filter(m -> m.getValue() >= 60)
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed() )
                .forEach(m -> result.add(m.getKey()));

        return result;
    }
}
