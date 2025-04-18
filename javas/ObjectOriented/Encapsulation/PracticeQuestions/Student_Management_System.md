## 🔹 Student Management System – Java

### ✅ Problem Statement

Create a class named `Student` that models a simplified student information system. This class should securely store the student's details and ensure that all the entered information is valid.

- `studentName` (String): The full name of the student.
- `studentID` (String): A unique alphanumeric student ID (e.g., "S12345").
- `age` (int): The age of the student.
- `email` (String): The email address of the student.
- `enrollmentDate` (String): The date of enrollment in `dd/mm/yyyy` format.

---

### 🎯 Requirements

1. All fields must be **private**.
2. Provide **public getters and setters** for each field.
3. Add **validations** in the setters:
    - `studentID` must be **alphanumeric** and follow the pattern "S" followed by 5 digits (e.g., "S12345").
    - `age` must be a **positive integer** between 18 and 100.
    - `email` must be in a valid **email format** (e.g., "student@example.com").
    - `enrollmentDate` must follow the **`dd/mm/yyyy`** format.
4. Create a method `isValidStudent()` that:
    - Returns `true` only if **all fields are non-null** and **valid**.
    - Otherwise, prints appropriate error messages and returns `false`.

---

### 🧠 Sample Output
```aiignore
Student Name: John Doe
Student ID: S12345
Age: 21
Email: john.doe@example.com
Enrollment Date: 12/09/2020
Valid Student: true

Student ID must follow the pattern "S" followed by 5 digits.
Age must be a positive integer between 18 and 100.
Invalid email format.
Invalid enrollment date format (must be dd/mm/yyyy).
Student Name: null
Student ID: null
Age: -5
Email: null
Enrollment Date: null
Valid Student: false
```