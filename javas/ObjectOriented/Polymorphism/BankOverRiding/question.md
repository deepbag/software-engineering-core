## 🔸 Polymorphism – Method Overriding – Java

### ✅ Problem Statement

Create a base class called `Bank` with a method:

- `getInterestRate()` that prints `"Interest rate: 0%"`

Then, create three subclasses:

- `SBI` that overrides `getInterestRate()` to print `"Interest rate: 5%"`
- `ICICI` that overrides `getInterestRate()` to print `"Interest rate: 6%"`

### 🎯 Requirements:

1. Use **inheritance** and **method overriding**.
2. In the `main` method, create objects of `Bank`, `SBI` and `ICICI`.
3. Call the `getInterestRate()` method using each object, preferably through a reference of type `Bank` (to demonstrate runtime polymorphism).

---

### 🧠 Sample Output:
```aiignore
Interest rate: 0% 
Interest rate: 5% 
Interest rate: 6% 
Interest rate: 7%
```