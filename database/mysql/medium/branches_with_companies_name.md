**Question**: Write a SQL query to list all branches along with their company names.

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
SELECT branches.name AS branch_name, companies.name AS company_name
FROM branches
JOIN companies ON branches.company_id = companies.id;
```
</details>