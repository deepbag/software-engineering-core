**Question**: Write a SQL query to list all company names that were created before January 1, 2024.

**Tables**: `companies`

**Difficulty**: Low

**Expected Output**:  
A table with columns `company_name`. Example:

| company_name  |
|---------------|
| Acme Corp     |
| Tech Solutions|

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS company_name
FROM companies
WHERE created_at < '2024-01-01';
```
</details>