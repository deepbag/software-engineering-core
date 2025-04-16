**Question**: Write a SQL query to retrieve the names of all employees and their respective department names, including employees in departments that may not exist in the `departments` table.

**Tables**: `departments` and `employees`

**Difficulty**: Medium

**Expected Output**:  
A table with columns `employee_name`, `department_name`. Example:

| employee_name | department_name |
|---------------|-----------------|
| John Doe      | Engineering     |
| Jane Smith    | HR              |
| Bob Johnson   | NULL            |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    CONCAT(e.first_name, ' ', e.last_name) AS employee_name,
    d.name AS department_name
FROM employees e
LEFT JOIN departments d ON e.department_id = d.id;
```
</details>