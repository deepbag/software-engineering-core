**Question**: Write a SQL query to retrieve the names and states of all branches located in a specific state (e.g., 'California').

**Tables**: `branches`

**Difficulty**: Low

**Expected Output**:  
A table with columns `branch_name`, `state`. Example:

| branch_name | state      |
|-------------|------------|
| Downtown    | California |
| Uptown      | California |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS branch_name,
    state
FROM branches
WHERE state = 'California';
```
</details>