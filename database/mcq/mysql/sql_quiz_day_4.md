### Day 4 SQL Multiple Choice Questions

1. **What is a TRIGGER in SQL?**\
   a) A stored procedure executed manually\
   b) A special type of stored procedure executed automatically\
   c) A constraint to enforce data integrity\
   d) A temporary table
   <details><summary>Show Answer</summary>Answer: b) A special type of stored procedure executed automatically<br>Explanation: A TRIGGER is a database object that automatically executes in response to specific events (e.g., INSERT, UPDATE, DELETE) on a table. Unlike regular stored procedures, triggers are not called manually and are used to enforce rules or automate tasks.</details>


2. **Which SQL statement creates a stored procedure?**\
   a) CREATE PROCEDURE\
   b) MAKE PROCEDURE\
   c) DEFINE ROUTINE\
   d) SET PROCEDURE
   <details><summary>Show Answer</summary>Answer: a) CREATE PROCEDURE<br>Explanation: The CREATE PROCEDURE statement defines a stored procedure, which is a reusable set of SQL statements stored in the database. It can accept parameters and be called to perform tasks, improving modularity and efficiency.</details>


3. **What does the CASE expression do in SQL?**\
   a) Compares two tables\
   b) Provides conditional logic in queries\
   c) Creates a new column\
   d) Joins multiple tables
   <details><summary>Show Answer</summary>Answer: b) Provides conditional logic in queries<br>Explanation: The CASE expression allows conditional logic within SQL queries, similar to if-then-else statements. It evaluates conditions and returns values based on the first matching condition, often used for data transformation.</details>


4. **Which SQL function is used to concatenate strings?**\
   a) CONCAT()\
   b) MERGE()\
   c) JOIN()\
   d) APPEND()
   <details><summary>Show Answer</summary>Answer: a) CONCAT()<br>Explanation: The CONCAT() function combines two or more strings into a single string. For example, CONCAT('Hello', 'World') returns 'HelloWorld'. Some databases use || for concatenation, but CONCAT() is widely supported.</details>


5. **What is the purpose of a WINDOW function in SQL?**\
   a) To filter rows\
   b) To perform calculations across a set of rows\
   c) To create a new table\
   d) To lock a database
   <details><summary>Show Answer</summary>Answer: b) To perform calculations across a set of rows<br>Explanation: WINDOW functions calculate results over a defined set of rows (a "window") without collapsing the result set, unlike aggregate functions. Examples include ROW_NUMBER(), RANK(), and SUM() OVER().</details>


6. **Which SQL statement revokes permissions from a user?**\
   a) DENY\
   b) REVOKE\
   c) REMOVE\
   d) CANCEL
   <details><summary>Show Answer</summary>Answer: b) REVOKE<br>Explanation: The REVOKE statement removes previously granted permissions (e.g., SELECT, INSERT) from a user or role. It ensures that access control is updated, restricting what users can do in the database.</details>


7. **What does the EXISTS operator test in a SQL query?**\
   a) The existence of a table\
   b) The presence of rows in a subquery\
   c) The uniqueness of a column\
   d) The nullability of a value
   <details><summary>Show Answer</summary>Answer: b) The presence of rows in a subquery<br>Explanation: The EXISTS operator checks if a subquery returns any rows. It returns true if at least one row exists, often used in correlated subqueries to test conditions against related data.</details>


8. **Which SQL clause limits the number of rows returned in a query?**\
   a) TOP\
   b) LIMIT\
   c) RESTRICT\
   d) REDUCE
   <details><summary>Show Answer</summary>Answer: b) LIMIT<br>Explanation: The LIMIT clause (or TOP in some databases like SQL Server) restricts the number of rows returned by a query. For example, SELECT * FROM table LIMIT 10 returns only the first 10 rows.</details>


9. **What is the purpose of the CHECK constraint in SQL?**\
   a) To ensure unique values\
   b) To enforce a condition on column values\
   c) To link tables\
   d) To sort data
   <details><summary>Show Answer</summary>Answer: b) To enforce a condition on column values<br>Explanation: The CHECK constraint ensures that all values in a column meet a specific condition, such as age > 0. It helps maintain data integrity by rejecting invalid data during INSERT or UPDATE operations.</details>


10. **Which SQL function returns the current date and time?**\
    a) NOW()\
    b) TODAY()\
    c) CURRENT()\
    d) DATE()
    <details><summary>Show Answer</summary>Answer: a) NOW()<br>Explanation: The NOW() function (or CURRENT_TIMESTAMP in some databases) returns the current date and time based on the database server’s clock. It’s useful for timestamping records or filtering by date.</details>