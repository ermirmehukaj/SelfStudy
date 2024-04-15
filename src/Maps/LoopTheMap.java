package Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LoopTheMap {

    public static void main(String[] args) {


        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson", 125000);
        map.put("Steven", 135000);

        System.out.println("2.1 who has the maximum and minimum salary?");
        int maxSalary = 0;
        for (Map.Entry<String, Integer> elements : map.entrySet()) {
            String name = elements.getKey();
            int salary = elements.getValue();
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }
        System.out.println(maxSalary);


        System.out.println("2.2 how many employees has the salary between 120k ~ 150K?");
        int count = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int salary = entry.getValue();
            if (salary >= 120000 && salary <= 150000) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println("2.3 display the names of the employees who are making less than 118k?");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int salary = entry.getValue();
            if(salary<118000){
                System.out.println(name);
            }

        }


        System.out.println("2.4 increase the salary employee by 10K if the current salary of employee is less than 120K");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            int salary = entry.getValue();
            if(salary<120000){
                map.put(name,salary +10000);
            }
    }
        System.out.println(map);

    }}
/*
2. Given following map that contains employee name and employee salary:
	 Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

    2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K

 */