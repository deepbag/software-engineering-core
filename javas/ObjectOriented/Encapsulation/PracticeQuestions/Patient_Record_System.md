# 🔹 Patient Record System – Java

### ✅ Problem Statement

Create a class named `Patient` that models a simplified hospital record system. This class should securely store patient details and ensure that all the entered information is valid.

- `patientName` (String): Full name of the patient.
- `patientID` (String): A unique alphanumeric patient ID (e.g., "P123456").
- `age` (int): Age of the patient.
- `phoneNumber` (String): A 10-digit contact number.
- `bloodGroup` (String): The blood group of the patient (e.g., "A+", "B-", "O+", "AB-").
- `admissionDate` (String): Date of admission in `dd/mm/yyyy` format.

---

### 🎯 Requirements

1. All fields must be **private**.
2. Provide **public getters and setters** for each field.
3. Add **validations** in the setters:
    - `patientID` must start with `"P"` followed by exactly 6 digits (e.g., "P123456").
    - `age` must be a **positive integer** (between 0 and 120).
    - `phoneNumber` must be **exactly 10 digits**.
    - `bloodGroup` must be one of: **"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"**.
    - `admissionDate` must follow the **`dd/mm/yyyy`** format.
    - `patientName` must not be empty.
4. Create a method `isValidPatient()` that:
    - Returns `true` only if **all fields are non-null** and **valid**.
    - Otherwise, prints appropriate error messages and returns `false`.

---

### 🧠 Sample Output
```aiignore
Patient Name: Priya Sharma
Patient ID: P123456
Age: 32
Phone Number: 9876543210
Blood Group: B+
Admission Date: 15/04/2024
Valid Patient Record: true

Patient ID must start with 'P' followed by 6 digits.
Invalid age. Must be between 0 and 120.
Phone number must be exactly 10 digits.
Invalid blood group. Allowed values: A+, A-, B+, B-, O+, O-, AB+, AB-.
Invalid admission date format (must be dd/mm/yyyy).
Patient Name: null
Patient ID: X123
Age: -1
Phone Number: 1234
Blood Group: XZ
Admission Date: 32/13/2024
Valid Patient Record: false
```