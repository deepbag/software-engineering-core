package data_structure_algorithm.data_structure;
import java.util.ArrayList;
import java.util.List;

class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void getName(){
        System.out.println("Name: "+this.name);
    }
}

public class ArrayListDynamicOfReference {
    public static void main(String[] arg){
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee("Java"));
        empList.add(new Employee("JavaScript"));
        empList.add(new Employee("HTML"));

        for(Employee emp: empList){
            emp.getName();
        }
    }
}
