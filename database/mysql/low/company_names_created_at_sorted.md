**Question**: Write a SQL query to retrieve the names and creation dates of all companies sorted by creation date in ascending order.

**Tables**: `companies`

**Difficulty**: Low

**Expected Output**:  
A table with columns `company_name`, `created_at`. Example:

| company_name  | created_at          |
|---------------|---------------------|
| Acme Corp     | 2022-05-10 09:00:00 |
| Tech Solutions| 2023-01-15 14:20:00 |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS company_name,
    created_at
FROM companies
ORDER BY created_at ASC;
```
</details>