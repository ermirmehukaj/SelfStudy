package Streams.TraderAndTransaction;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);

        System.out.println(traders);


        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println("1. Find all transactions in the year 2011 and sort them by value(small to high)");

        transactions.stream()
                .filter(a -> a.getYear() == 2011)
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("2. What are all the unique cities where the traders work?");


         traders.stream()
                 .map(Trader::getCity)
                 .distinct()
                 .forEach(System.out::println);


        System.out.println("3. Find all traders from Cambridge and sort them by name.");

        traders.stream()
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);


        System.out.println("4. Return a string of all traders’ names sorted alphabetically.");

        traders.stream().map(Trader::getName)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("5. Are any traders based in Milan?");

      boolean any=  traders.stream()
                .anyMatch(trader -> trader.getCity().equals("Milan"));

        System.out.println(any);


        System.out.println("6. Print the values of all transactions from the traders living in Cambridge.");

        transactions.stream()
                .filter(a->a.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)

                .forEach(System.out::println);


        System.out.println("7. What is the highest value of all the transactions?");
       int max =  transactions.stream()
               .map(Transaction::getValue)
                .max(Comparator.naturalOrder()).orElse(0);

        System.out.println(max);



        System.out.println("7. What is the lowest value of all the transactions?");
        Optional<Transaction> min =  transactions.stream()
                        .min(Comparator.comparing(Transaction::getValue));


        System.out.println(min);

    }
}
