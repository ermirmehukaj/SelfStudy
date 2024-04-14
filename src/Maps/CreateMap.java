package Maps;

import java.util.HashMap;
import java.util.Map;

public class CreateMap {


    public static void main(String[] args) {


        Map<String,int[]> map = new HashMap<>();

        map.put("Ermir",new int[]{50, 90, 80, 70, 60});
        map.put("Labi",new int[]{90, 80, 70, 60, 50});
        map.put("Vali",new int[]{100, 70, 60, 50, 80});


        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            String name = entry.getKey();
            int[] scores = entry.getValue();
            System.out.println(name + " " + scores[0] + " " + scores[1] + " " + scores[2] + " " + scores[3] + " " + scores[4]);
        }

    }





    }


/*
. Create a map that can contain the student name (String) and student scores (int[]) as a pair
(Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
 */