package GroupPractice;

public class Test {
    public static void main(String[] args) {
        Mammal mamal = new Mammal(5);
    }


    class Platypus extends Mammal {
        public Platypus() {
            System.out.println("Platypus");
        }
    }

class Mammal{
        public Mammal(int age){
            System.out.println("Mammal");
        }
    }
}
