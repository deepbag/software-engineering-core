package javas.ObjectOriented.Constructor;

public class Constructor {
    public static void main(String[] args) {
        // Creating a Car object and passing values to the constructor
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Displaying the details of the car
        myCar.displayCarDetails();
    }
}

// Define a class called 'Car'
class Car {
    // Instance variables
    String make;
    String model;
    int year;

    // Constructor to initialize the Car object
    public Car(String make, String model, int year) {
        this.make = make;  // Set the make of the car
        this.model = model; // Set the model of the car
        this.year = year; // Set the year of the car
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}