## 🔹 Doctor Information System – Java

### ✅ Problem Statement

Create a class named `Doctor` that models a simplified doctor management system for a hospital. This class should securely store doctor details and validate the entered information.

- `doctorName` (String): Full name of the doctor.
- `doctorID` (String): Unique ID for the doctor (e.g., "D1023").
- `specialization` (String): Medical specialization (e.g., "Cardiologist", "Dermatologist").
- `experienceYears` (int): Number of years of medical experience.
- `contactNumber` (String): A 10-digit contact number.
- `email` (String): Official email address.

---

### 🎯 Requirements

1. All fields must be **private**.
2. Provide **public getters and setters** for each field.
3. Add **validations** in the setters:
    - `doctorID` must start with `"D"` followed by 4 digits (e.g., "D1234").
    - `specialization` must not be empty.
    - `experienceYears` must be between **0 and 60**.
    - `contactNumber` must be **exactly 10 digits**.
    - `email` must follow a valid email format (e.g., ends with `@hospital.com`).
    - `doctorName` must not be empty.
4. Create a method `isValidDoctor()` that:
    - Returns `true` only if **all fields are non-null** and **valid**.
    - Otherwise, prints appropriate error messages and returns `false`.

---

### 🧠 Sample Output
```aiignore
Doctor Name: Dr. Anjali Mehta
Doctor ID: D2345
Specialization: Neurologist
Experience: 12 years
Contact: 9876543210
Email: anjali.mehta@hospital.com
Valid Doctor Record: true

Doctor ID must start with 'D' followed by 4 digits.
Specialization cannot be empty.
Experience must be between 0 and 60.
Contact number must be exactly 10 digits.
Invalid email format (must end with @hospital.com).
Doctor Name: null
Doctor ID: 1234X
Specialization: 
Experience: -3
Contact: 12345
Email: anjali@gmail.com
Valid Doctor Record: false
```