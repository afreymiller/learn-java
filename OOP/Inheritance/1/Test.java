/* Demonstrate inheritance in Java */
 
/* Base class */
class Vehicle {
    /* Instance variables */
    public int year;
    public int speed;
    public int numWheels;
         
    /* Constructors */
    public Vehicle(int year, int speed) {
        this.year = year;
        this.speed = speed;
    }
         
    public void decelerate(int decrement) {
        speed -= decrement;
    }
         
    public void accelerate(int increment) {
        speed += increment;
    }

    public void printSpeed() {
        System.out.println("The vehicle's speed is: " + speed);
    }
}
 
/* Derived vehicle class */
class Car extends Vehicle {
     
    /* Specific to car */
    public String manufacturer;
 
    /* Constructor */
    public Car(int year, int speed, String manufacturer) {
        /* Invoking parent constructor */
        super(year, speed);

        this.numWheels = 4;

        this.manufacturer = manufacturer;
    } 
         
    /* Add an additional method */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    } 
     
    /* Override printInfo method of parent class */
    @Override
    public void printSpeed() {
        System.out.println("The car's speed is "+ this.speed);
    }
     
}
 
/* Main class */
public class Test {
    public static void main(String args[]) {
        Car c = new Car(2010, 60, "Ford");
        c.printSpeed();
    }
}