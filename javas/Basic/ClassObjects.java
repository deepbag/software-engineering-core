package javas.Basic;

public class ClassObjects {
    String color = "Red";

    public void drive(){
        System.out.println("drive.....");
    }

    public static void main(String[] arg){
        ClassObjects cb = new ClassObjects();
        cb.drive();
    }
}
