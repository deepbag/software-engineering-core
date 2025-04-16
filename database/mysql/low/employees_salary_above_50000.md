**Question**: Write a SQL query to list the first names, last names, and salaries of employees with a salary greater than 50000.

**Tables**: `employees`

**Difficulty**: Low

**Expected Output**:  
A table with columns `first_name`, `last_name`, `salary`. Example:

| first_name | last_name | salary   |
|------------|-----------|----------|
| John       | Doe       | 75000.00 |
| Jane       | Smith     | 65000.00 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    first_name,
    last_name,
    salary
FROM employees
WHERE salary > 50000;
```
</details>