## 🔹 AadharCard Information System – Java

### ✅ Problem Statement

Create a class named `AadharCard` that models a simplified version of an Indian Aadhar Card system. This class should securely store an individual’s Aadhar details and ensure that all the entered information is valid.

- `name` (String): The full name of the cardholder
- `aadharNumber` (String): A 12-digit unique Aadhar number
- `phone` (String): A 10-digit phone number of the cardholder
- `address` (String): The residential address of the cardholder
- `dateOfBirth` (String): The date of birth of the cardholder in `dd/mm/yyyy` format

---

### 🎯 Requirements

1. All fields must be **private**.
2. Provide **public getters and setters** for each field.
3. Add **validations** in the setters:
   - `aadharNumber` must be **exactly 12 digits** (numeric only).
   - `phone` must be **exactly 10 digits** (numeric only).
   - `address` must not be empty.
   - `dateOfBirth` must follow the **`dd/mm/yyyy`** format.
4. Create a method `isValidAadharCard()` that:
   - Returns `true` only if **all fields are non-null** and **valid**.
   - Otherwise, prints appropriate error messages and returns `false`.

---

### 🧠 Sample Output
```aiignore
Name: Ravi Kumar
Aadhar: 123456789012
Phone: 9876543210
Address: 123, MG Road, Mumbai
Date of Birth: 01/01/1990
Valid Aadhar Card: true

Aadhar number must be exactly 12 digits.
Invalid phone number format (must be exactly 10 digits).
Address cannot be empty.
Invalid date format (must be dd/mm/yyyy).
Name: Test User
Aadhar: null
Phone: null
Address: null
Date of Birth: null
Valid Aadhar Card: Yes

```

