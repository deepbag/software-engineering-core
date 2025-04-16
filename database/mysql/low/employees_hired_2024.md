**Question**: Write a SQL query to retrieve the first names, last names, and hire dates of employees who were hired in the year 2024.

**Tables**: `employees`

**Difficulty**: Low

**Expected Output**:  
A table with columns `first_name`, `last_name`, `hire_date`. Example:

| first_name | last_name | hire_date  |
|------------|-----------|------------|
| Jane       | Smith     | 2024-01-10 |
| Bob        | Johnson   | 2024-03-22 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    first_name,
    last_name,
    hire_date
FROM employees
WHERE YEAR(hire_date) = 2024;
```
</details>