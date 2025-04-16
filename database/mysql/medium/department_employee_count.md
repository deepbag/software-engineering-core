**Question**: Write a SQL query to count the number of employees in each department, including departments with zero employees.

**Tables**: `departments` and `employees`

**Difficulty**: Medium

### Expected Output

A table with columns `department_name`, `employee_count`. Example:

| department_name | employee_count |
|-----------------|----------------|
| Engineering     | 5              |
| HR              | 2              |
| Marketing       | 0              |

Empty if no data exists.

---

## Solution

<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT d.name AS department_name, COUNT(e.id) AS employee_count
FROM departments d
LEFT JOIN employees e ON d.id = e.department_id
GROUP BY d.id, d.name;
```
</details>