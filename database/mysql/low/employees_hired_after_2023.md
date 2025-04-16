**Question**: Write a SQL query to list the first names, last names, and hire dates of employees hired after January 1, 2023.

**Tables**: `employees`

**Difficulty**: Low

**Expected Output**:  
A table with columns `first_name`, `last_name`, `hire_date`. Example:

| first_name | last_name | hire_date  |
|------------|-----------|------------|
| John       | Doe       | 2023-06-15 |
| Jane       | Smith     | 2024-01-10 |

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
WHERE hire_date > '2023-01-01';
```
</details>