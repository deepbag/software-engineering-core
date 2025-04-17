package javas.ObjectOriented.ClassObject.Collage;

public class Student {
    String name;
    int rollNumber;
    float marks;

    Student(String name, int rollNumber, float marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Roll Number: "+this.rollNumber);
        System.out.println("Marks: "+this.marks);
        System.out.println("Result: "+(this.hasPassed()?"Pass":"Fail"));
    }

    boolean hasPassed(){
        return this.marks >= 40;
    }
}
