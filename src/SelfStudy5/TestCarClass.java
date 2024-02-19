package SelfStudy5;

public class TestCarClass {
    public static void main(String[] args) {

        Honda honda = new Honda("Honda","Honda 11",2020,30000,"White");
        Audi audi = new Audi("Audi","Q5",2019,40000,"Black");

        System.out.println(audi);
        audi.autoPark();

        System.out.println(honda);
         honda.drive();
         honda.start();


    }
}
