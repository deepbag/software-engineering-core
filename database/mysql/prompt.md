Below is a detailed description of the schema for the four tables: `companies`, `branches`, `departments`, and `employees`.

### Table Schema

1. **Table: companies**
    - **Purpose**: Stores information about companies.
    - **Columns**:
        - `id`: INT, AUTO_INCREMENT, PRIMARY KEY - Unique identifier for each company.
        - `name`: VARCHAR(255), NOT NULL - Company name.
        - `registration_number`: VARCHAR(100), UNIQUE, NOT NULL - Unique registration number.
        - `created_at`: TIMESTAMP, DEFAULT CURRENT_TIMESTAMP - Record creation timestamp.
    - **Indexes**:
        - `idx_company_name` on `name` for faster searches.
    - **Constraints**:
        - `registration_number` is unique.
    - **Table Options**:
        - CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci.

2. **Table: branches**
    - **Purpose**: Stores information about company branches.
    - **Columns**:
        - `id`: INT, AUTO_INCREMENT, PRIMARY KEY - Unique identifier for each branch.
        - `company_id`: INT, NOT NULL - References a company.
        - `name`: VARCHAR(255), NOT NULL - Branch name.
        - `city`: VARCHAR(100), NULLABLE - City of the branch location.
        - `state`: VARCHAR(100), NULLABLE - State or region of the branch location.
        - `country`: VARCHAR(100), NULLABLE - Country of the branch location.
        - `created_at`: TIMESTAMP, DEFAULT CURRENT_TIMESTAMP - Record creation timestamp.
    - **Indexes**:
        - `idx_branch_name` on `name` for faster searches.
    - **Constraints**:
        - `FOREIGN KEY (company_id) REFERENCES companies(id) ON DELETE CASCADE` - Deletes branch if the referenced company is deleted.
    - **Table Options**:
        - CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci.

3. **Table: departments**
    - **Purpose**: Stores information about departments within branches.
    - **Columns**:
        - `id`: INT, AUTO_INCREMENT, PRIMARY KEY - Unique identifier for each department.
        - `branch_id`: INT, NOT NULL - References a branch.
        - `name`: VARCHAR(255), NOT NULL - Department name.
        - `created_at`: TIMESTAMP, DEFAULT CURRENT_TIMESTAMP - Record creation timestamp.
    - **Indexes**:
        - `idx_department_name` on `name` for faster searches.
    - **Constraints**:
        - `FOREIGN KEY (branch_id) REFERENCES branches(id) ON DELETE CASCADE` - Deletes department if the referenced branch is deleted.
    - **Table Options**:
        - CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci.

4. **Table: employees**
    - **Purpose**: Stores information about employees.
    - **Columns**:
        - `id`: INT, AUTO_INCREMENT, PRIMARY KEY - Unique identifier for each employee.
        - `department_id`: INT, NOT NULL - References a department.
        - `first_name`: VARCHAR(100), NOT NULL - Employee's first name.
        - `last_name`: VARCHAR(100), NOT NULL - Employee's last name.
        - `email`: VARCHAR(255), UNIQUE, NOT NULL - Unique employee email address.
        - `phone`: VARCHAR(20), UNIQUE, NULLABLE - Unique phone number.
        - `hire_date`: DATE, NOT NULL - Date the employee was hired.
        - `salary`: DECIMAL(10,2), NULLABLE - Salary (up to 10 digits with 2 decimal places).
        - `created_at`: TIMESTAMP, DEFAULT CURRENT_TIMESTAMP - Record creation timestamp.
    - **Indexes**:
        - Implicit index on `email` due to UNIQUE constraint.
        - Implicit index on `phone` due to UNIQUE constraint.
    - **Constraints**:
        - `FOREIGN KEY (department_id) REFERENCES departments(id) ON DELETE CASCADE` - Deletes employee if the referenced department is deleted.
        - `CONSTRAINT chk_salary CHECK (salary >= 0 OR salary IS NULL)` - Ensures salary is non-negative or null.
    - **Table Options**:
        - CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci.