### Day 1 Java Class and Object Multiple Choice Questions

1. **What is a class in Java primarily used for?**\  
   a) Executing database queries  
   b) Defining a blueprint for objects  
   c) Managing server-side logic  
   d) Creating user interfaces
   <details><summary>Show Answer</summary>Answer: b) Defining a blueprint for objects<br><br>Explanation: A class in Java is a template that defines the properties (fields) and behaviors (methods) of objects. Option a is incorrect as database queries are handled by libraries like JDBC. Option c is unrelated, as server-side logic is managed by frameworks like Spring. Option d is incorrect, as user interfaces are built using libraries like Swing or JavaFX.</details>


2. **What is an object in Java?**  
   a) A method that performs an action  
   b) An instance of a class  
   c) A variable type  
   d) A static field
   <details><summary>Show Answer</summary>Answer: b) An instance of a class<br><br>Explanation: An object is an instance of a class, created using the `new` keyword, representing a specific realization of the class's blueprint. Option a is incorrect, as methods define behavior. Option c is wrong, as objects are instances, not types. Option d is incorrect, as static fields belong to the class, not objects.</details>


3. **How is an object created in Java?**  
   a) Using the `class` keyword  
   b) Using the `new` keyword  
   c) Using the `this` keyword  
   d) Using the `static` keyword
   <details><summary>Show Answer</summary>Answer: b) Using the `new` keyword<br><br>Explanation: An object is created with the `new` keyword followed by a constructor call (e.g., `ClassName obj = new ClassName();`). Option a is incorrect, as `class` defines a class. Option c is wrong, as `this` refers to the current object. Option d is incorrect, as `static` denotes class-level members.</details>


4. **What is a constructor in Java?**  
   a) A method to destroy objects  
   b) A special method to initialize objects  
   c) A static field in a class  
   d) A loop to iterate objects
   <details><summary>Show Answer</summary>Answer: b) A special method to initialize objects<br><br>Explanation: A constructor is a special method with the same name as the class, used to initialize objects when created with `new`. Option a is incorrect, as Java uses garbage collection, not destructors. Option c is wrong, as fields store data. Option d is unrelated, as constructors are not loops.</details>


5. **Which keyword is used to define a class in Java?**  
   a) `object`  
   b) `class`  
   c) `new`  
   d) `interface`
   <details><summary>Show Answer</summary>Answer: b) `class`<br><br>Explanation: The `class` keyword is used to define a class (e.g., `class MyClass {}`). Option a is incorrect, as `object` is not a keyword. Option c is wrong, as `new` creates objects. Option d is incorrect, as `interface` defines interfaces, not classes.</details>


6. **What does the `this` keyword refer to in a Java class?**  
   a) A static method  
   b) The current object  
   c) A parent class  
   d) A new object
   <details><summary>Show Answer</summary>Answer: b) The current object<br><br>Explanation: The `this` keyword refers to the current object instance within a class’s methods or constructors. Option a is incorrect, as `this` is not used for static methods. Option c is wrong, as `super` refers to the parent class. Option d is incorrect, as `this` does not create objects.</details>


7. **Which of the following is true about a Java class?**  
   a) It can only have one object  
   b) It can have multiple instances (objects)  
   c) It cannot contain methods  
   d) It is always static
   <details><summary>Show Answer</summary>Answer: b) It can have multiple instances (objects)<br><br>Explanation: A class can have multiple objects created from it using `new`. Option a is incorrect, as multiple objects are allowed. Option c is wrong, as classes can contain methods. Option d is incorrect, as classes are not inherently static.</details>


8. **What is the default value of an instance variable if not initialized?**  
   a) `null` for objects, `0` for numbers  
   b) `undefined`  
   c) `void`  
   d) Random value
   <details><summary>Show Answer</summary>Answer: a) `null` for objects, `0` for numbers<br><br>Explanation: Instance variables are automatically initialized to `null` for reference types, `0` for numeric types, and `false` for booleans. Option b is incorrect, as `undefined` is not a Java concept. Option c is wrong, as `void` is a return type. Option d is incorrect, as Java does not assign random values.</details>


9. **What is encapsulation in Java?**  
   a) Hiding a class from other classes  
   b) Bundling data and methods with access control  
   c) Creating multiple objects  
   d) Defining static methods
   <details><summary>Show Answer</summary>Answer: b) Bundling data and methods with access control<br><br>Explanation: Encapsulation involves bundling fields and methods in a class and controlling access using modifiers like `private` or `public`. Option a is incorrect, as hiding a class is not encapsulation. Option c is unrelated to encapsulation. Option d is wrong, as encapsulation is not about static methods.</details>


10. **Which access modifier makes a class member accessible only within its class?**  
    a) `public`  
    b) `protected`  
    c) `private`  
    d) `default`
    <details><summary>Show Answer</summary>Answer: c) `private`<br><br>Explanation: The `private` access modifier restricts access to within the same class. Option a is incorrect, as `public` allows access from anywhere. Option b is wrong, as `protected` allows access within the package and subclasses. Option d is incorrect, as `default` (package-private) allows access within the same package.</details>