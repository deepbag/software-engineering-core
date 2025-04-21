### Day 3 Java Class and Object Multiple Choice Questions

1. **What is an abstract class in Java?**  
   a) A class that cannot have methods  
   b) A class that cannot be instantiated directly  
   c) A class that must be final  
   d) A class with only static methods
   <details><summary>Show Answer</summary>Answer: b) A class that cannot be instantiated directly<br><br>Explanation: An abstract class, declared with the `abstract` keyword, cannot be instantiated and is meant to be extended by subclasses. It can contain both abstract and concrete methods. Option a is incorrect, as abstract classes can have methods. Option c is wrong, as `final` prevents extension, not instantiation. Option d is incorrect, as abstract classes are not limited to static methods.</details>


2. **What is the purpose of an interface in Java?**  
   a) To store data fields  
   b) To define a contract for classes to implement  
   c) To create objects directly  
   d) To extend another interface only
   <details><summary>Show Answer</summary>Answer: b) To define a contract for classes to implement<br><br>Explanation: An interface defines a contract of methods that implementing classes must provide, using the `implements` keyword. Option a is incorrect, as interfaces typically don’t hold data fields (except constants). Option c is wrong, as interfaces cannot be instantiated. Option d is partially true but too narrow, as interfaces can be implemented by classes.</details>


3. **What is method overriding in Java?**  
   a) Defining a method with the same name in the same class  
   b) Redefining a parent class method in a subclass  
   c) Creating multiple constructors  
   d) Declaring a method as private
   <details><summary>Show Answer</summary>Answer: b) Redefining a parent class method in a subclass<br><br>Explanation: Method overriding occurs when a subclass provides a specific implementation for a method already defined in its parent class, using the same signature. Option a refers to overloading. Option c relates to constructor overloading. Option d is incorrect, as overriding is unrelated to access modifiers.</details>


4. **Which keyword is used to implement an interface in Java?**  
   a) `extends`  
   b) `implements`  
   c) `super`  
   d) `interface`
   <details><summary>Show Answer</summary>Answer: b) `implements`<br><br>Explanation: The `implements` keyword is used by a class to adopt an interface’s methods (e.g., `class MyClass implements MyInterface`). Option a is for class inheritance. Option c refers to parent class access. Option d is used to define an interface, not implement it.</details>


5. **What is a default method in an interface?**  
   a) A method that cannot be overridden  
   b) A method with a body provided in the interface  
   c) A static method only  
   d) A method that is private
   <details><summary>Show Answer</summary>Answer: b) A method with a body provided in the interface<br><br>Explanation: Since Java 8, default methods in interfaces (declared with `default`) provide a body and can be inherited or overridden by implementing classes. Option a is incorrect, as default methods can be overridden. Option c is wrong, as default methods are instance methods, not static. Option d is incorrect, as default methods are public.</details>


6. **What is an inner class in Java?**  
   a) A class defined within another class  
   b) A class that extends another class  
   c) A class with only static members  
   d) A class that implements an interface
   <details><summary>Show Answer</summary>Answer: a) A class defined within another class<br><br>Explanation: An inner class is a non-static class defined inside another class, often used for encapsulation or logical grouping. Option b refers to inheritance. Option c describes a static nested class, not an inner class. Option d is unrelated to inner classes.</details>


7. **Which of the following can an interface extend?**  
   a) A class  
   b) Another interface  
   c) An abstract class  
   d) A static class
   <details><summary>Show Answer</summary>Answer: b) Another interface<br><br>Explanation: An interface can extend one or more interfaces using the `extends` keyword (e.g., `interface Child extends Parent`). Option a is incorrect, as interfaces cannot extend classes. Option c is wrong, as abstract classes are not extended by interfaces. Option d is invalid, as static classes are not a distinct concept in Java.</details>


8. **What is the `@Override` annotation used for?**  
   a) To make a method static  
   b) To indicate a method overrides a parent class method  
   c) To define a constructor  
   d) To hide a method from subclasses
   <details><summary>Show Answer</summary>Answer: b) To indicate a method overrides a parent class method<br><br>Explanation: The `@Override` annotation ensures a method correctly overrides a parent class or interface method, catching errors at compile time. Option a is incorrect, as `@Override` is unrelated to `static`. Option c is wrong, as constructors cannot be overridden. Option d refers to access control, not overriding.</details>


9. **What happens if a subclass does not override an abstract method?**  
   a) The subclass compiles successfully  
   b) The subclass must be declared abstract  
   c) The subclass becomes final  
   d) The subclass cannot be instantiated
   <details><summary>Show Answer</summary>Answer: b) The subclass must be declared abstract<br><br>Explanation: If a subclass of an abstract class does not implement all abstract methods, it must be declared `abstract` itself. Option a is incorrect, as compilation fails without implementation or `abstract`. Option c is wrong, as `final` prevents extension. Option d is true for abstract classes but not the direct answer.</details>


10. **What is a static nested class in Java?**  
    a) A class defined inside another class with the `static` keyword  
    b) A class that cannot have instances  
    c) A class that extends a static method  
    d) A class that is always public
    <details><summary>Show Answer</summary>Answer: a) A class defined inside another class with the `static` keyword<br><br>Explanation: A static nested class is defined inside another class with the `static` keyword and does not require an instance of the enclosing class. Option b is incorrect, as static nested classes can have instances. Option c is invalid, as classes don’t extend methods. Option d is wrong, as access modifiers vary.</details>