**Question**: Write an SQL query to retrieve the emails of all employees.

**Difficulty**: Low

**Expected Output**:  
A single-column table listing employee emails.

| email                  |
|------------------------|
| john.doe@example.com   |
| jane.smith@example.com |

Empty if no employees are present.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT email FROM employees;
```
</details> 