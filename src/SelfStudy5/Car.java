package SelfStudy5;

public abstract class Car {
    private final String make,model;

    private final int year;

    private double price;
    private String color;

    public Car(String make, String model, int year, double price, String color) {
        if(make == null || make.isEmpty()){
            throw new RuntimeException("Make cannot be null or empty");
        }
        this.make = make;
        if(model == null || make.isEmpty()){
            throw new RuntimeException("Model cannot be null or empty");
        }
        this.model = model;
        if(year<1986){
            throw new RuntimeException("Year cannot be less than 1986");
        }
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<0){
            throw new RuntimeException("Price cannot be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || color.isEmpty()){
            throw new RuntimeException("Color cannot be null or empty");
        }
        this.color = color;
    }


    public abstract void start();
    public abstract void drive();

    public void stop(){
        System.out.println(make + " is stoping in the parking");
    }

    @Override
    public String toString() {
        return "{ make='" + getClass().getSimpleName() +
                  '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

/*
1. Create an Abstract class named Car:
				Variables:
					make (final), model (final), year (final), price, color

				Encapsulate all the fields.

				Add a constructor that can set all the fields.

				Condition for setting the fields:
						1. make, model, color can not be null
						2. make, model, color can not be empty
						2. year can not be less than 1886
						2. price can not be negative

				Abstract methods:
					start();
					drive();

				None-abstract methods:
					stop()
					toString()


	2. Create an interface named AutoPark
				Variables:
					hasAutoPark

				Abstract method:
					autoPark();

	3. Create a child interface of AutoPark named AutoPilot
						hint: interface can inherit from another interface by using the extends keyword
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

	4. Create an interface named Flyable
				Variables:
						canFly

				Abstract Method
					fly();


	5. Create a subclass of Car named Toyota

	6. Create a subclass of Car named Honda

	7. Create a subclass of Car named BMW

	8. Create two subclasses of Car named Audi &  Mercedes that implement the AutoPark interface

	9. Create Two subclasses of Car named Tesla & Nio that implement AutoPark & AutoPilot interfaces

	10 Create a subclass of Car named CydeoCar that implements AutoPark, AutoPilot, and Flyable interfaces

	11. Create a class named CarShop:
			Create an object from each concrete class

			Test all the functions of each object.

            Analyze the relationships between the classes.
 */
