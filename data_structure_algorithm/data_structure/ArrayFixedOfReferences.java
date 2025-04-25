package data_structure_algorithm.data_structure;

class Person {
    String name;

    Person(String name){
        this.name = name;
    }

    void getName(){
        System.out.println("Name: "+this.name);
    }
}

public class ArrayFixedOfReferences {
    public static void main(String[] arg){
        Person[] persons = new Person[3];

        persons[0] = new Person("Java");
        persons[1] = new Person("Javascript");
        persons[2] = new Person("Python");

        for(Person p:persons){
            p.getName();
        }
    }
}
