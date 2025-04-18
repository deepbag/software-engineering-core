## 🔹 Car Registration System – Java

### ✅ Problem Statement

Create a class named `Car` that models a simplified car registration system. This class should securely store the car's details and ensure that all the entered information is valid.

- `carOwnerName` (String): The name of the car owner.
- `licensePlate` (String): A unique license plate number (e.g., "MH12AB1234").
- `carModel` (String): The model of the car (e.g., "Honda Civic").
- `yearOfManufacture` (int): The year the car was manufactured.
- `fuelType` (String): The type of fuel the car uses (e.g., "Petrol", "Diesel").

---

### 🎯 Requirements

1. All fields must be **private**.
2. Provide **public getters and setters** for each field.
3. Add **validations** in the setters:
    - `licensePlate` must be **alphanumeric** and follow the pattern `XX00XX0000` (e.g., "MH12AB1234").
    - `yearOfManufacture` must be between **1900 and the current year**.
    - `fuelType` must be one of the following: **"Petrol"**, **"Diesel"**, or **"Electric"**.
    - `carOwnerName` must not be empty.
4. Create a method `isValidCar()` that:
    - Returns `true` only if **all fields are non-null** and **valid**.
    - Otherwise, prints appropriate error messages and returns `false`.

---

### 🧠 Sample Output
```aiignore
Car Owner Name: David Lee
License Plate: MH12AB1234
Car Model: Toyota Corolla
Year of Manufacture: 2018
Fuel Type: Petrol
Valid Car Registration: true

License Plate must follow the pattern XX00XX0000.
Year of Manufacture must be between 1900 and the current year.
Invalid fuel type (must be one of: Petrol, Diesel, Electric).
Car Owner Name: null
License Plate: null
Car Model: null
Year of Manufacture: 1800
Fuel Type: Gasoline
Valid Car Registration: false
```
```