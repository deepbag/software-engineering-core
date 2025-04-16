**Question**: Write a SQL query to retrieve the names and cities of all branches where the city is not null.

**Tables**: `branches`

**Difficulty**: Low

**Expected Output**:  
A table with columns `branch_name`, `city`. Example:

| branch_name | city      |
|-------------|-----------|
| Downtown    | New York  |
| Uptown      | Chicago   |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS branch_name,
    city
FROM branches
WHERE city IS NOT NULL;
```
</details>