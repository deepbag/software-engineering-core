**Question**: Write an SQL query to retrieve the names of all branches along with the names of the companies they belong to, using the `branches` and `companies` tables.

**Difficulty**: Medium

**Expected Output**:  
A table with columns `branch_name`, `company_name`. Example:

| branch_name | company_name |
|-------------|--------------|
| Downtown    | Acme Corp    |
| Uptown      | Acme Corp    |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT b.name AS branch_name, c.name AS company_name
FROM branches b
JOIN companies c ON b.company_id = c.id;
```
</details>