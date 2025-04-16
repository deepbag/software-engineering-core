**Question**: Write a SQL query to find all companies that have branches in multiple cities, along with the count of their branches.

**Tables**: `companies` and `branches`

**Difficulty**: Medium

**Expected Output**:  
A table with columns `company_name`, `branch_count`. Example:

| company_name   | branch_count |
|----------------|--------------|
| Acme Corp      | 3            |
| Tech Solutions | 2            |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    c.name AS company_name,
    COUNT(b.id) AS branch_count
FROM companies c
JOIN branches b ON c.id = b.company_id
GROUP BY c.id, c.name
HAVING COUNT(DISTINCT b.city) > 1;
```
</details>