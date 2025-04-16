**Question**: Write a SQL query to retrieve the names and countries of all branches located in a specific country (e.g., 'USA').

**Tables**: `branches`

**Difficulty**: Low

**Expected Output**:  
A table with columns `branch_name`, `country`. Example:

| branch_name | country |
|-------------|---------|
| Downtown    | USA     |
| Uptown      | USA     |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS branch_name,
    country
FROM branches
WHERE country = 'USA';
```
</details>