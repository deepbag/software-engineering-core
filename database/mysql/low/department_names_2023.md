**Question**: Write a SQL query to retrieve the names and creation dates of all departments created in the year 2023.

**Tables**: `departments`

**Difficulty**: Low

**Expected Output**:  
A table with columns `department_name`, `created_at`. Example:

| department_name | created_at          |
|-----------------|---------------------|
| Engineering     | 2023-01-01 10:00:00 |
| HR              | 2023-06-15 14:30:00 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS department_name,
    created_at
FROM departments
WHERE YEAR(created_at) = 2023;
```
</details>