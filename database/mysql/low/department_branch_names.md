**Question**: Write a SQL query to list all departments and their branch names.

**Tables**: `branches`, `departments`

**Difficulty**: Low

**Expected Output**:  
A table with columns `department_name`, `branch_name`. Example:

| department_name | branch_name |
|-----------------|-------------|
| Engineering     | Downtown    |
| HR              | Uptown      |
| Marketing       | Downtown    |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    d.name AS department_name,
    b.name AS branch_name
FROM departments d
JOIN branches b ON d.branch_id = b.id;
```
</details> 