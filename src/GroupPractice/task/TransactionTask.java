package GroupPractice.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TransactionTask {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul","Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Trader> traders = new ArrayList<>(Arrays.asList(raoul,mario,alan,brian));

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian,2011,300),
                new Transaction(raoul,2012,1000),
                new Transaction(raoul,2011,400),
                new Transaction(mario,2012,710),
                new Transaction(mario,2012,700),
                new Transaction(alan,2012,950)
        );

        System.out.println("Task 1 - Find all transactions in the year 2011 and sort them by value(small to high");
 transactions.stream()
         .filter(p->p.getYear() ==2011)
         .sorted(Comparator.comparing(Transaction::getValue))
         .forEach(System.out::println);

        System.out.println("Task 2 - What are all the unique cities where the traders work?");

        List<String> uniqueCities = traders.stream()
                .map(Trader::getCity)
                .distinct()
                .collect(Collectors.toList());

        uniqueCities.forEach(s-> System.out.println(s));

        System.out.println("Task 3 -  Find all traders from Cambridge and sort them by name.");

        List<Trader> city = traders.stream()
                .filter(p->p.getCity().equalsIgnoreCase("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());

        System.out.println(city);

        System.out.println(" Task 4 -  Return a string of all traders’ names sorted alphabetically.");

        String allTradersName =transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .sorted() // to sorted alphabetically
                .reduce("", (x, y) -> x + " " + y); // concat with space
        System.out.println(allTradersName);

        System.out.println(" Task 5 -   Are any traders based in Milan?");

        boolean isMilan = traders.stream()
                .anyMatch(p->p.getCity().equalsIgnoreCase("Milan"));
        System.out.println(isMilan);

        System.out.println("Task 6 -   Print the values of all transactions from the traders living in Cambridge.");

        List<Integer> values = transactions.stream()
                .filter(p->p.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                .map(Transaction::getValue)
                .collect(Collectors.toList());

        System.out.println(values);







    }
}
