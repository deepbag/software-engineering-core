**Question**: Write a SQL query to identify departments where all employees have a salary above the company-wide average salary, including the company name, branch name, and department name, but only for companies with branches in multiple countries.

**Tables**: `companies`, `branches`, `departments`, `employees`

**Difficulty**: High

**Expected Output**:  
A table with columns `company_name`, `branch_name`, `departmentابی_name`. Example:

| company_name   | branch_name | department_name |
|----------------|-------------|-----------------|
| Acme Corp      | Downtown    | Engineering     |
| Tech Solutions | London      | R&D             |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    c.name AS company_name,
    b.name AS branch_name,
    d.name AS department_name
FROM companies c
JOIN branches b ON c.id = b.company_id
JOIN departments d ON b.id = d.branch_id
JOIN employees e ON d.id = e.department_id
WHERE c.id IN (
    SELECT company_id
    FROM branches
    GROUP BY company_id
    HAVING COUNT(DISTINCT country) > 1
)
GROUP BY c.id, b.id, d.id, c.name, b.name, d.name
HAVING MIN(e.salary) > (
    SELECT AVG(salary)
    FROM employees e2
    JOIN departments d2 ON e2.department_id = d2.id
    JOIN branches b2 ON d2.branch_id = b2.id
    WHERE b2.company_id = c.id
);
```
</details> 