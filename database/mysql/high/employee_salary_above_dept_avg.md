**Question**: Write a SQL query to identify employees who earn more than the average salary of their department and work in branches located in a specific country (e.g., 'USA'), including the company name, branch name, and department name in the result.

**Tables**: `companies`, `branches`, `departments`, `employees`

**Difficulty**: High

**Expected Output**:  
A table with columns `employee_name`, `company_name`, `branch_name`, `department_name`, `salary`. Example:

| employee_name | company_name  | branch_name | department_name | salary   |
|---------------|---------------|-------------|-----------------|----------|
| John Doe      | Acme Corp     | Downtown    | Engineering     | 75000.00 |
| Jane Smith    | Acme Corp     | Downtown    | HR              | 65000.00 |

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
    e.salary
FROM employees e
JOIN departments d ON e.department_id = d.id
JOIN branches b ON d.branch_id = b.id
JOIN companies c ON b.company_id = c.id
WHERE e.salary > (
    SELECT AVG(salary)
    FROM employees e2
    WHERE e2.department_id = e.department_id
)
AND b.country = 'USA'
ORDER BY e.salary DESC;
```
</details>