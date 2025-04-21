package javas.AccessModifires;

// final can be applied to variables, methods, and classes. It restricts modification in different ways:
// Final Variable: Once assigned a value, it cannot be changed.
// Final Method: It cannot be overridden by subclasses.
// Final Class: It cannot be subclassed (i.e., no inheritance).

// Final Variable:
public class Final {
    final int value = 10;

    void changeValue() {
        // value = 20; // This would throw an error because final variables cannot be changed
    }
}

// Final Method:
class ParentFinal {
    final void display() {
        System.out.println("Parent class display method");
    }
}

class ChildFinal extends ParentFinal {
    // void display() { } // This would throw an error, cannot override final method
}

// Final Class:
final class FinalClass {
    // Class code here
}

// class SubClass extends FinalClass {} // This would throw an error, cannot extend final class