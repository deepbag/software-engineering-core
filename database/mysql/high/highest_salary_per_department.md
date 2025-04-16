**Question**: Write a SQL query to find employees who have the highest salary in their department, but only for departments in branches located in a specific state (e.g., 'California'), including the company name, branch name, department name, and salary.

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
    CONCAT(e1.first_name, ' ', e1.last_name) AS employee_name,
    c.name AS company_name,
    b.name AS branch_name,
    d.name AS department_name,
    e1.salary
FROM employees e1
JOIN departments d ON e1.department_id = d.id
JOIN branches b ON d.branch_id = b.id
JOIN companies c ON b.company_id = c.id
WHERE e1.salary = (
    SELECT MAX(e2.salary)
    FROM employees e2
    WHERE e2.department_id = e1.department_id
)
AND b.state = 'California'
ORDER BY e1.salary DESC;
```
</details> 