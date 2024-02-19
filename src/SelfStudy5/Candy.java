package SelfStudy5;

public class Candy {


    private String brand;

    private int quantity;

    private double price;

    private boolean hasPeanuts;


    public Candy(String brand, int quantity, double price, boolean hasPeanuts) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanuts = hasPeanuts;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            throw new RuntimeException("Quantity cannot be 0 or less than 0");
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <0){
            throw new RuntimeException("Price cannot be less than 0");
        }
        this.price = price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public double calcPrice(){
        return price * quantity;
    }


    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + ((price==0)?"Free": ""+ price) +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}

   /* Create a custom class named Candy
private variables:
        brand (String), quantity (int), price (double), hasPeanuts (boolean)

        Encapsulate All the private fields.
        (the price of candy can not be set to negative)
        (quantity of candy can not be set to zero or negative)

        Add a constructor that allows the user to set all the fields when the object is created.
        (If the arguments are not valid, they should not be set to the instances)

        Extra methods:
        toString():
        if the price is zero, print "free" instead of 0

        5.1 Create a class named CandyFactory
        Create an ArrayList of candies
        Add five objects of candies
        Use a for each loop to print the brand and price of each candy*/