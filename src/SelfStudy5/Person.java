package SelfStudy5;

public class Person {

    public String name;
    public int age;
    public char gender;

    public static boolean isHuman = true;

    public static boolean hasNose = true;

    public static boolean hasWings =false;

    public static int numberOfHead =1;
    public static int numberOfEyes = 2;


    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void eat(){
        System.out.println(name + " is eating meat");
    }

    public void drinking(){
        System.out.println(name + " is drinking milk");
    }

    public void sleep(){

        System.out.println(name + " sleeps 7 hours a day");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
  /*  Person Task:
        1. Create a class named Person:

        Attributes:
        Instance: name, age, gender

static: isHuman(boolean), hasNose(boolean), hasWings (boolean), numberOfHead, numberOfEyes,

        Add a constructor that can set All the fields (instances)


        Actions:
        eat(String food)
        drink(String drink)
        sleep()
        toString()   */
