package javas.AccessModifires;

// super is a reference variable used to refer to the immediate parent class object. It is commonly used in the context of inheritance to:
// Access parent class methods or variables.
// Call the parent class constructor.

class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }

    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor");
    }

    void display() {
        super.display();
        System.out.println("Child class display method");
    }
}

public class Super {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}
