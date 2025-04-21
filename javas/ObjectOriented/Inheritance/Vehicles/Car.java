package javas.ObjectOriented.Inheritance.Vehicles;

public class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType){
        super(brand,speed);
        this.fuelType = fuelType;
    }

    void displayCarInfo(){
        System.out.println("Brand: "+ this.brand);
        System.out.println("Speed: "+ this.speed);
        System.out.println("Fuel Type: "+ this.fuelType);
    }
}
