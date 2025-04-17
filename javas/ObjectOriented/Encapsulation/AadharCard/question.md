## 🔹 AadharCard Class Practice – Java

### ✅ Problem Statement

Create a class called `AadharCard` with the following properties:

- `holderName` (String)
- `aadharNumber` (String)
- `email` (String)

---

### 🎯 Requirements

1. All fields must be **private** (Encapsulation).
2. Provide **getters and setters** for each field.
3. Add validation:
    - `aadharNumber` must be exactly **12 digits**.
    - `email` must contain **@** and **.** (dot).
4. Create a method `isValidAadharCard()` to check if all fields are valid.

---

### 🧠 Sample Output
```aiignore
Name: Ravi Kumar
Aadhar: 123456789012
Email: ravi@example.com
Valid Aadhar Card: true

Aadhar number must be exactly 12 digits.
Invalid email format.
Name: Test User
Aadhar: null
Email: null
Valid Aadhar Card: false
```

