**Question**: Write a SQL query to list all department names and their creation dates.

**Tables**: `departments`

**Difficulty**: Low

**Expected Output**:  
A table with columns `department_name`, `created_at`. Example:

| department_name | created_at          |
|-----------------|---------------------|
| Engineering     | 2023-01-01 10:00:00 |
| HR              | 2023-02-15 12:30:00 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS department_name,
    created_at
FROM departments;
```
</details>