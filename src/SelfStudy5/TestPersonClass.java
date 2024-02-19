package SelfStudy5;

public class TestPersonClass {
    public static void main(String[] args) {


        Person person1 = new Person("Ermir",31,'M');

        System.out.println(person1);

        person1.eat();
        person1.sleep();
        person1.drinking();

        System.out.println(Person.hasNose);
        System.out.println(Person.isHuman);
        System.out.println(Person.numberOfEyes);
        System.out.println(Person.numberOfHead);
        System.out.println(Person.hasWings);





    }
}
