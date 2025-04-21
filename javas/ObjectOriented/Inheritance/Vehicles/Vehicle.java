package javas.ObjectOriented.Inheritance.Vehicles;

public class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand,int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo(){
        System.out.println("Brand: "+ this.brand);
        System.out.println("Speed: "+ this.speed);
    }
}
