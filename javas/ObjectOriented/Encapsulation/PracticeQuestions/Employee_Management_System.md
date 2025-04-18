## 🔹 Employee Management System – Java

### ✅ Problem Statement

Create a class named `Employee` that models a simplified employee information system. This class should securely store the employee's details and ensure that all the entered information is valid.

- `employeeName` (String): The full name of the employee.
- `employeeID` (String): A unique alphanumeric employee ID (e.g., "E12345").
- `salary` (double): The salary of the employee.
- `email` (String): The email address of the employee.
- `dateOfJoining` (String): The date of joining in `dd/mm/yyyy` format.

---

### 🎯 Requirements

1. All fields must be **private**.
2. Provide **public getters and setters** for each field.
3. Add **validations** in the setters:
    - `employeeID` must be **alphanumeric** and follow the pattern "E" followed by 5 digits (e.g., "E12345").
    - `salary` must be **positive**.
    - `email` must be in a valid **email format** (e.g., "user@example.com").
    - `dateOfJoining` must follow the **`dd/mm/yyyy`** format.
4. Create a method `isValidEmployee()` that:
    - Returns `true` only if **all fields are non-null** and **valid**.
    - Otherwise, prints appropriate error messages and returns `false`.

---

### 🧠 Sample Output
```aiignore
Employee Name: Alice Johnson
Employee ID: E12345
Salary: 50000.00
Email: alice.johnson@example.com
Date of Joining: 15/03/2020
Valid Employee: true

Employee ID must follow the pattern "E" followed by 5 digits.
Salary cannot be negative.
Invalid email format.
Invalid date format (must be dd/mm/yyyy).
Employee Name: null
Employee ID: null
Salary: -5000.00
Email: null
Date of Joining: null
Valid Employee: false
