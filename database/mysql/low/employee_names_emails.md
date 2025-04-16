**Question**: Write a SQL query to retrieve the names and emails of all employees.

**Tables**: `employees`

**Difficulty**: Low

**Expected Output**:  
A table with columns `employee_name`, `email`. Example:

| employee_name | email                 |
|---------------|-----------------------|
| John Doe      | john.doe@email.com    |
| Jane Smith    | jane.smith@email.com  |


Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    CONCAT(first_name, ' ', last_name) AS employee_name,
    email
FROM employees;
```
</details> 