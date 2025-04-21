### Day 2 Java Class and Object Multiple Choice Questions

1. **What is a method in a Java class?**  
   a) A variable that stores data  
   b) A block of code that performs a task  
   c) A type of constructor  
   d) A static class
   <details><summary>Show Answer</summary>Answer: b) A block of code that performs a task<br><br>Explanation: A method is a block of code within a class that performs a specific task and can be called on objects or statically. Option a is incorrect, as variables store data, not methods. Option c is wrong, as constructors initialize objects, not methods. Option d is incorrect, as methods are not classes.</details>


2. **What does the `public` access modifier allow?**  
   a) Access only within the same class  
   b) Access from any class  
   c) Access only within the same package  
   d) Access only in subclasses
   <details><summary>Show Answer</summary>Answer: b) Access from any class<br><br>Explanation: The `public` modifier allows a class, method, or field to be accessed from any class, regardless of package or hierarchy. Option a refers to `private`. Option c describes `default` (package-private). Option d is related to `protected`.</details>


3. **What is method overloading in Java?**  
   a) Defining multiple methods with the same name but different parameters  
   b) Calling a method multiple times  
   c) Overriding a method in a subclass  
   d) Declaring a method as static
   <details><summary>Show Answer</summary>Answer: a) Defining multiple methods with the same name but different parameters<br><br>Explanation: Method overloading allows multiple methods with the same name but different parameter lists (e.g., type, number, or order). Option b is incorrect, as calling methods is not overloading. Option c refers to method overriding. Option d is unrelated to overloading.</details>


4. **What is the purpose of the `super` keyword in Java?**  
   a) To create a new object  
   b) To access parent class members  
   c) To make a method static  
   d) To define a constant
   <details><summary>Show Answer</summary>Answer: b) To access parent class members<br><br>Explanation: The `super` keyword is used to access fields, methods, or constructors of a parent class in a subclass. Option a is incorrect, as `new` creates objects. Option c is wrong, as `static` defines class-level members. Option d is unrelated, as constants use `final`.</details>


5. **What is inheritance in Java?**  
   a) Creating multiple objects from a class  
   b) A class extending another class to inherit its properties  
   c) Hiding data within a class  
   d) Overloading methods in a class
   <details><summary>Show Answer</summary>Answer: b) A class extending another class to inherit its properties<br><br>Explanation: Inheritance allows a subclass to inherit fields and methods from a parent class using the `extends` keyword. Option a refers to object creation. Option c describes encapsulation. Option d relates to method overloading.</details>


6. **Which keyword prevents a class from being subclassed?**  
   a) `static`  
   b) `final`  
   c) `abstract`  
   d) `protected`
   <details><summary>Show Answer</summary>Answer: b) `final`<br><br>Explanation: The `final` keyword, when applied to a class, prevents it from being extended (e.g., `final class MyClass`). Option a is incorrect, as `static` denotes class-level members. Option c is wrong, as `abstract` requires subclassing. Option d is an access modifier.</details>


7. **What happens if a constructor is not defined in a Java class?**  
   a) The class cannot be instantiated  
   b) A default no-arg constructor is provided  
   c) The class becomes abstract  
   d) A static constructor is created
   <details><summary>Show Answer</summary>Answer: b) A default no-arg constructor is provided<br><br>Explanation: If no constructor is defined, Java provides a default no-argument constructor that initializes fields to their default values. Option a is incorrect, as instantiation is still possible. Option c is wrong, as `abstract` is explicit. Option d is invalid, as Java has no static constructors.</details>


8. **What is the output of `toString()` if not overridden in a class?**  
   a) The class name and hash code  
   b) The object’s field values  
   c) A blank string  
   d) A null value
   <details><summary>Show Answer</summary>Answer: a) The class name and hash code<br><br>Explanation: The default `toString()` method from the `Object` class returns the class name and hash code (e.g., `ClassName@hashCode`). Option b requires overriding `toString()`. Option c is incorrect, as it’s not blank. Option d is wrong, as it’s not null.</details>


9. **What is a static method in Java?**  
   a) A method that belongs to an object  
   b) A method that belongs to the class  
   c) A method that cannot be called  
   d) A method that is abstract
   <details><summary>Show Answer</summary>Answer: b) A method that belongs to the class<br><br>Explanation: A static method, declared with the `static` keyword, belongs to the class and can be called without creating an object. Option a refers to instance methods. Option c is incorrect, as static methods are callable. Option d is wrong, as `abstract` methods are different.</details>


10. **What is polymorphism in Java?**  
    a) Defining multiple classes with the same name  
    b) Allowing different classes to be treated as instances of a common superclass  
    c) Creating multiple constructors  
    d) Hiding methods from subclasses
    <details><summary>Show Answer</summary>Answer: b) Allowing different classes to be treated as instances of a common superclass<br><br>Explanation: Polymorphism allows objects of different classes to be treated as objects of a common superclass, often via method overriding or interfaces. Option a is incorrect, as classes cannot share names. Option c refers to constructor overloading. Option d relates to encapsulation or access control.</details>