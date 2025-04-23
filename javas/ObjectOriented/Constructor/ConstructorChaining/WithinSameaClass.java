package javas.ObjectOriented.Constructor.ConstructorChaining;

public class WithinSameaClass {
    public static void main(String[] args) {
        // Using Constructor 1
        Car myCar1 = new Car("Toyota", "Corolla", 2020);
        myCar1.displayCarDetails();

        // Using Constructor 2
        Car myCar2 = new Car("Honda", "Civic");
        myCar2.displayCarDetails();

        // Using Constructor 3
        Car myCar3 = new Car();
        myCar3.displayCarDetails();
    }
}

class Car {
    String make;
    String model;
    int year;

    // Constructor 1: accepts all three parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Constructor 2: only accepts make and model, assumes default year
    public Car(String make, String model) {
        this(make, model, 2020);  // Calling Constructor 1
    }

    // Constructor 3: default constructor, assumes default make and model
    public Car() {
        this("Unknown", "Unknown");  // Calling Constructor 2
    }

    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}