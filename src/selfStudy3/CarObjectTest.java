package selfStudy3;

public class CarObjectTest {
    public static void main(String[] args) {

        Car car = new Car();
        car.make = "Audi";
        car.model= "Q5";
        car.color = "White";
        car.year = 2020;
        car.price = 60.000;

        System.out.println(car);

        car.start();




    }
}
