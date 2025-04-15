**Question**: Write an SQL query to retrieve all department names from the `departments` table.

**Difficulty**: Low

**Expected Output**:  
A single-column table listing all department names.

| name    |
|---------|
| HR      |
| IT      |
| Finance |

Empty if no departments are present.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT name FROM departments;
```
</details>