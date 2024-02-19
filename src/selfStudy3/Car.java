package selfStudy3;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;

   public double price;



   public void start(){
       System.out.println(make + " " + model + " is strating");
   }



    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*  Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in a print statement, it should display all the information of the car object
			start()*/