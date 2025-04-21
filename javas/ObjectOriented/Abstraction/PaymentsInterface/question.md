## 🔸 Interface – Java

### ✅ Problem Statement

Create an interface called `Payment` with the following method:

- `processPayment()` that prints `"Processing payment..."`

Then, create two classes that implement this interface:

- `CreditCardPayment` that implements `processPayment()` to print `"Processing credit card payment."`
- `PayPalPayment` that implements `processPayment()` to print `"Processing PayPal payment."`

### 🎯 Requirements:

1. Use an **interface** to define the `processPayment()` method.
2. Implement the `processPayment()` method in both `CreditCardPayment` and `PayPalPayment` classes.
3. In the `main` method, create objects of both classes and call the `processPayment()` method.

---

### 🧠 Sample Output:
```aiignore
Processing credit card payment. 
Processing PayPal payment.
```