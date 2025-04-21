## 🔸 Inheritance Without Overriding – Java

### ✅ Problem Statement

Create a base class called `Vehicle` with the following properties:

- `brand` (String)
- `speed` (int)

Add a method `displayInfo()` to print brand and speed.

Then, create a derived class `Car` that inherits from `Vehicle` and adds:

- `fuelType` (String)

Add a method `displayCarInfo()` in `Car` that first calls `displayInfo()` from `Vehicle`, and then prints the `fuelType`.

### 🎯 Requirements:

1. Use **inheritance** without method overriding.
2. Call base class method from derived class using `super` or object reference.
3. In the `main` method, create a `Car` object and display all details.

---

### 🧠 Sample Output:
```aiignore
Brand: Toyota
Speed: 120
Fuel Type: Petrol
```