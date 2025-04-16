**Question**: Write a SQL query to retrieve the names and registration numbers of all companies whose names contain the word 'Tech'.

**Tables**: `companies`

**Difficulty**: Low

**Expected Output**:  
A table with columns `company_name`, `registration_number`. Example:

| company_name   | registration_number |
|----------------|---------------------|
| Tech Solutions | REG67890            |
| Tech Innovations | REG54321          |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS company_name,
    registration_number
FROM companies
WHERE name LIKE '%Tech%';
```
</details>