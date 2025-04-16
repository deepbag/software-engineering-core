**Question**: Write a SQL query to find the total salary of employees in each branch, sorted by total salary in descending order. 

**Tables**: `employees` and `branches`

**Difficulty**: Medium

**Expected Output**:  
A table with columns `branch_name`, `total_salary`.

| branch_name | total_salary |
|-------------|--------------|
| Downtown    | 150000.00    |
| Uptown      | 80000.00     |
| Suburb      | 0.00         |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    b.name AS branch_name,
    COALESCE(SUM(e.salary), 0) AS total_salary
FROM branches b
LEFT JOIN employees e ON b.id = e.branch_id
GROUP BY b.id, b.name
ORDER BY total_salary DESC;
```
</details>