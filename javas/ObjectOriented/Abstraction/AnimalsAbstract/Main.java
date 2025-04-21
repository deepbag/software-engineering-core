package javas.ObjectOriented.Abstraction.AnimalsAbstract;

public class Main {
    public static void main(String[] arg){
        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();

        Cow cow = new Cow();
        cow.makeSound();
        cow.sleep();
    }
}
