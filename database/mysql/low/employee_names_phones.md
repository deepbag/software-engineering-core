**Question**: Write a SQL query to retrieve the names and phone numbers of all employees who have a phone number recorded.

**Tables**: `employees`

**Difficulty**: Low

**Expected Output**:  
A table with columns `employee_name`, `phone`. Example:

| employee_name | phone        |
|---------------|--------------|
| John Doe      | 123-456-7890 |
| Jane Smith    | 098-765-4321 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    CONCAT(first_name, ' ', last_name) AS employee_name,
    phone
FROM employees
WHERE phone IS NOT NULL;
```
</details>