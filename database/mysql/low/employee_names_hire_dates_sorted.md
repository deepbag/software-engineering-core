**Question**: Write a SQL query to list the names and hire dates of employees sorted by hire date in descending order.

**Tables**: `employees`

**Difficulty**: Low

**Expected Output**:  
A table with columns `employee_name`, `hire_date`. Example:

| employee_name | hire_date  |
|---------------|------------|
| Jane Smith    | 2024-01-10 |
| John Doe      | 2023-06-15 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    CONCAT(first_name, ' ', last_name) AS employee_name,
    hire_date
FROM employees
ORDER BY hire_date DESC;
```
</details>