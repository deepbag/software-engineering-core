package javas.ObjectOriented.Inheritance.PersonEmployee;

public class Employee extends Person {
    int employeeId;
    double salary;

    Employee(String name, int age,int employeeId,double salary){
        super(name,age);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("EmployeeId: "+this.employeeId);
        System.out.println("Salary: "+this.salary);
    }
}
