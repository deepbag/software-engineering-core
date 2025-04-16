**Question**: Write a SQL query to list the names and countries of all branches sorted by country in ascending order.

**Tables**: `branches`

**Difficulty**: Low

**Expected Output**:  
A table with columns `branch_name`, `country`. Example:

| branch_name | country |
|-------------|---------|
| Uptown      | Canada  |
| Downtown    | USA     |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS branch_name,
    country
FROM branches
ORDER BY country ASC;
```
</details>