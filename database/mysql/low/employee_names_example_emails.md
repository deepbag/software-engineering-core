**Question**: Write a SQL query to list the names and emails of employees whose email addresses end with '@example.com'.

**Tables**: `employees`

**Difficulty**: Low

**Expected Output**:  
A table with columns `employee_name`, `email`. Example:

| employee_name | email               |
|---------------|---------------------|
| John Doe      | john.doe@example.com |
| Jane Smith    | jane.smith@example.com |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    CONCAT(first_name, ' ', last_name) AS employee_name,
    email
FROM employees
WHERE email LIKE '%@example.com';
```
</details>