**Question**: Write a SQL query to list all company names and their registration numbers.

**Tables**: `companies`

**Difficulty**: Low

**Expected Output**:  
A table with columns `company_name`, `registration_number`. Example:

| company_name   | registration_number |
|----------------|---------------------|
| Acme Corp      | REG12345            |
| Tech Solutions | REG67890            |

Empty if no data exists.

**Solution**:
<details>
<summary>Click to show/hide the solution</summary>

```sql
SELECT 
    name AS company_name,
    registration_number
FROM companies;
```
</details>