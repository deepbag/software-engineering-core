package javas.ObjectOriented.Inheritance.PersonEmployee;

public class Main {
    public static void main(String[] arg){
        Employee emp1 = new Employee("John",30,101,55000);
        Employee emp2 = new Employee("Sarah",28,102,62000.5);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}
