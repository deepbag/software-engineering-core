**Question**: Write a SQL query to find the top 3 highest-paid employees in each company who were hired in the last 2 years, including their company name, branch name, department name, and hire date, ensuring that only employees from branches in cities with multiple branches are included.

**Tables**: `companies`, `branches`, `departments`, `employees`

**Difficulty**: High

**Expected Output**:  
A table with columns `employee_name`, `company_name`, `branch_name`, `department_name`, `salary`, `hire_date`. Example:

| employee_name | company_name  | branch_name | department_name | salary   | hire_date  |
|---------------|---------------|-------------|-----------------|----------|------------|
| John Doe      | Acme Corp     | Downtown    | Engineering     | 75000.00 | 2023-06-15 |
| Jane Smith    | Acme Corp     | Downtown    | HR              | 70000.00 | 2024-01-10 |
| Bob Johnson   | Acme Corp     | Uptown      | Marketing       | 68000.00 | 2023-09-22 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    CONCAT(e.first_name, ' ', e.last_name) AS employee_name,
    c.name AS company_name,
    b.name AS branch_name,
    d.name AS department_name,
    e.salary,
    e.hire_date
FROM employees e
JOIN departments d ON e.department_id = d.id
JOIN branches b ON d.branch_id = b.id
JOIN companies c ON b.company_id = c.id
WHERE b.city IN (
    SELECT city
    FROM branches
    GROUP BY city
    HAVING COUNT(id) > 1
)
AND e.hire_date >= DATE_SUB(CURDATE(), INTERVAL 2 YEAR)
ORDER BY company_name, e.salary DESC
LIMIT 3;
```
</details> 