package javas.ObjectOriented.Constructor.ConstructorChaining;

// Superclass (Vehicle)
class Vehicle {
    String type;

    // Constructor in superclass (Vehicle)
    public Vehicle(String type) {
        this.type = type;
    }

    // Method to display the vehicle type
    public void displayType() {
        System.out.println("Vehicle Type: " + type);
    }
}

// Subclass (Bike) inheriting from Vehicle
class Bike extends Vehicle {
    String brand;
    String model;

    // Constructor in subclass (Bike) calling the superclass constructor
    public Bike(String brand, String model, String type) {
        super(type);  // Calling the constructor of Vehicle to initialize 'type'
        this.brand = brand;
        this.model = model;
    }

    // Method to display details of the bike
    public void displayBikeDetails() {
        displayType();  // Calling method from superclass to display vehicle type
        System.out.println("Bike Brand: " + brand);
        System.out.println("Bike Model: " + model);
    }
}

public class InInheritance {
    public static void main(String[] args) {
        // Creating a Bike object
        Bike myBike = new Bike("Harley-Davidson", "Street 750", "Cruiser");
        myBike.displayBikeDetails();
    }
}
