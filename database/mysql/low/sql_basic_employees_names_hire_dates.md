**Question**: Write a SQL query to retrieve the names and hire dates of all employees in the `employees` table.

**Difficulty**: Low

**Expected Output**:  
A table with columns `first_name`, `last_name`, and `hire_date`. Example:

| first_name | last_name | hire_date  |
|------------|-----------|------------|
| John       | Doe       | 2023-01-15 |
| Jane       | Smith     | 2024-03-22 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT first_name, last_name, hire_date
FROM employees;
```
</details>
