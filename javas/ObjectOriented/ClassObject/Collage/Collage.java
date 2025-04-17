package javas.ObjectOriented.ClassObject.Collage;

public class Collage {
    public static void main(String[] arg){
        Student student1 = new Student("Java",1,20);
        Student student2 = new Student("Javascript",2,30);
        Student student3 = new Student("PHP",3,40);

        student1.displayDetails();
        System.out.println("-----------------");
        student2.displayDetails();
        System.out.println("-----------------");
        student3.displayDetails();
    }
}
