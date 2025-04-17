## 🔹 BankAccount Class Practice – Java

### ✅ Problem Statement

Create a class called `BankAccount` with the following properties:

- `accountNumber` (String)
- `accountHolderName` (String)
- `balance` (double)

---

### 🎯 Requirements:

1. Make all properties **private** (Encapsulation).
2. Provide **getter and setter** methods for each property.
3. Add validation logic:
    - The balance cannot be negative.
    - The account number must be exactly 10 digits.
4. Create a method `deposit(double amount)` that adds to the balance.
5. Create a method `withdraw(double amount)` that deducts from the balance only if there’s enough money.
6. In the `main` method, create an object and test deposit, withdraw, and validation logic.

---

### 🧠 Sample Output
```aiignore
Account created successfully!
Deposited ₹2000.0
Withdrawn ₹500.0
Remaining Balance: ₹1500.0

Trying to withdraw ₹2000.0
Insufficient Balance!

Trying to set invalid account number...
Invalid Account Number!
```



