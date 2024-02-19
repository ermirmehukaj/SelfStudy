package SelfStudy5;

public class CydeoCar extends Car implements AutoPilot,AutoPark,Flyable{


    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {

    }

    @Override
    public void drive() {

    }

    @Override
    public void autoPark() {

    }

    @Override
    public String selfDrive() {
        return null;
    }

    @Override
    public String fly() {
        return null;
    }
}
