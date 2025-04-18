### Day 5 SQL Multiple Choice Questions

1. **What is a CURSOR in SQL?**\
   a) A tool to navigate through query results row by row\
   b) A type of index for faster queries\
   c) A temporary table for storing data\
   d) A constraint for data integrity
   <details><summary>Show Answer</summary>Answer: a) A tool to navigate through query results row by row<br>Explanation: A CURSOR allows processing each row returned by a query individually, often used in stored procedures or scripts for iterative tasks. It provides control over result sets, unlike standard queries that return all rows at once.</details>


2. **Which SQL clause is used to divide a table into partitions for performance?**\
   a) PARTITION BY\
   b) GROUP BY\
   c) SEGMENT BY\
   d) SPLIT BY
   <details><summary>Show Answer</summary>Answer: a) PARTITION BY<br>Explanation: The PARTITION BY clause, used in table creation or window functions, divides data into partitions to improve query performance or manage large datasets. For example, in window functions, it groups rows for calculations without collapsing the result set.</details>


3. **What does the JSON_EXTRACT function do in SQL?**\
   a) Converts a string to JSON format\
   b) Retrieves data from a JSON document\
   c) Merges multiple JSON objects\
   d) Deletes JSON data
   <details><summary>Show Answer</summary>Answer: b) Retrieves data from a JSON document<br>Explanation: JSON_EXTRACT (or similar functions like JSON_VALUE in some databases) extracts specific values from a JSON document stored in a column. For example, JSON_EXTRACT('{"name": "John"}', '$.name') returns 'John'.</details>


4. **Which type of index improves performance for range queries?**\
   a) B-TREE\
   b) HASH\
   c) FULL-TEXT\
   d) SPATIAL
   <details><summary>Show Answer</summary>Answer: a) B-TREE<br>Explanation: B-TREE indexes are optimized for range queries (e.g., WHERE age BETWEEN 20 AND 30) and sorting operations. They organize data in a balanced tree structure, making them suitable for most general-purpose indexing needs.</details>


5. **What is the purpose of the WITH clause in SQL?**\
   a) To define a temporary result set\
   b) To lock a table\
   c) To grant permissions\
   d) To drop a table
   <details><summary>Show Answer</summary>Answer: a) To define a temporary result set<br>Explanation: The WITH clause, also known as a Common Table Expression (CTE), defines a temporary result set that can be referenced within a query. It improves readability and allows reuse of subqueries, like WITH temp AS (SELECT * FROM table).</details>


6. **Which SQL function returns the length of a string?**\
   a) LENGTH()\
   b) SIZE()\
   c) COUNT()\
   d) CHAR()
   <details><summary>Show Answer</summary>Answer: a) LENGTH()<br>Explanation: The LENGTH() function (or LEN() in some databases) returns the number of characters in a string. For example, LENGTH('Hello') returns 5. It’s useful for string manipulation and validation.</details>


7. **What does the ON DELETE CASCADE option do in a FOREIGN KEY constraint?**\
   a) Prevents deletion of parent records\
   b) Deletes child records when the parent is deleted\
   c) Updates child records automatically\
   d) Locks the parent table
   <details><summary>Show Answer</summary>Answer: b) Deletes child records when the parent is deleted<br>Explanation: ON DELETE CASCADE ensures that when a record in the parent table is deleted, all related records in the child table are also deleted. This maintains referential integrity automatically.</details>


8. **Which SQL statement creates a synonym for a database object?**\
   a) CREATE ALIAS\
   b) CREATE SYNONYM\
   c) DEFINE LINK\
   d) SET REFERENCE
   <details><summary>Show Answer</summary>Answer: b) CREATE SYNONYM<br>Explanation: The CREATE SYNONYM statement creates an alias for a database object (e.g., table, view) to simplify queries or hide the object’s full name. For example, CREATE SYNONYM emp FOR employees allows using 'emp' in queries.</details>


9. **What is the purpose of the RANK() function in SQL?**\
   a) To count rows in a table\
   b) To assign rankings to rows within a partition\
   c) To sort data alphabetically\
   d) To merge rows
   <details><summary>Show Answer</summary>Answer: b) To assign rankings to rows within a partition<br>Explanation: RANK() is a window function that assigns a rank to each row within a partition based on the ORDER BY clause. Rows with equal values receive the same rank, with gaps in subsequent ranks (e.g., 1, 1, 3).</details>


10. **Which SQL operator checks if a value is within a range?**\
    a) IN\
    b) BETWEEN\
    c) EXISTS\
    d) LIKE
    <details><summary>Show Answer</summary>Answer: b) BETWEEN<br>Explanation: The BETWEEN operator checks if a value lies within a specified range, inclusive. For example, WHERE age BETWEEN 20 AND 30 matches rows where age is from 20 to 30, including the endpoints.</details>