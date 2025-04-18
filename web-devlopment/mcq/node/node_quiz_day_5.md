### Day 5 Node.js Multiple Choice Questions

1. **What is the purpose of the `ws` package in a Node.js application?**\
   a) To manage file system operations\
   b) To enable WebSocket communication\
   c) To compress HTTP responses\
   d) To parse URL query strings
   <details><summary>Show Answer</summary>Answer: b) To enable WebSocket communication<br><br>Explanation: The `ws` package is a popular library for implementing WebSocket servers and clients in Node.js, enabling real-time, bidirectional communication. Options a, c, and d are incorrect as they refer to unrelated functionalities handled by modules like `fs`, `zlib`, or `querystring`.</details>


2. **Which testing framework is commonly used for Node.js applications?**\
   a) Mocha\
   b) Express\
   c) Helmet\
   d) Sequelize
   <details><summary>Show Answer</summary>Answer: a) Mocha<br><br>Explanation: Mocha is a widely used testing framework for Node.js, supporting unit and integration tests with features like assertions and mocking. Express (b) is a web framework, Helmet (c) is for security, and Sequelize (d) is an ORM, making them incorrect for testing.</details>


3. **What does the `supertest` library help with in Node.js?**\
   a) Managing database connections\
   b) Testing HTTP endpoints\
   c) Optimizing server performance\
   d) Handling file uploads
   <details><summary>Show Answer</summary>Answer: b) Testing HTTP endpoints<br><br>Explanation: `supertest` is a library used with testing frameworks like Mocha to simulate HTTP requests and test API endpoints in Node.js applications. Options a, c, and d are incorrect as they refer to unrelated tasks not handled by `supertest`.</details>


4. **Which Node.js package is used to implement GraphQL APIs?**\
   a) Apollo Server\
   b) Morgan\
   c) Multer\
   d) PM2
   <details><summary>Show Answer</summary>Answer: a) Apollo Server<br><br>Explanation: Apollo Server is a popular library for building GraphQL APIs in Node.js, providing tools for schema definition and resolvers. Morgan (b) is for logging, Multer (c) handles file uploads, and PM2 (d) is for process management, making them incorrect.</details>


5. **What is a benefit of using PM2 for deploying Node.js applications?**\
   a) Automatic database schema migrations\
   b) Process management and automatic restarts\
   c) Client-side rendering optimization\
   d) Password hashing
   <details><summary>Show Answer</summary>Answer: b) Process management and automatic restarts<br><br>Explanation: PM2 is a process manager for Node.js that monitors applications, restarts them on crashes, and supports clustering. Options a, c, and d are incorrect as they refer to unrelated functionalities not provided by PM2.</details>


6. **What does the `nodemon` tool do in Node.js development?**\
   a) Compiles TypeScript code\
   b) Automatically restarts the server on code changes\
   c) Manages database migrations\
   d) Secures HTTP headers
   <details><summary>Show Answer</summary>Answer: b) Automatically restarts the server on code changes<br><br>Explanation: `nodemon` is a development tool that watches for file changes and automatically restarts the Node.js server, improving workflow. Options a, c, and d are incorrect as they refer to tasks handled by other tools like `tsc`, `Sequelize`, or `helmet`.</details>


7. **Which HTTP status code indicates a resource was not found in a Node.js API?**\
   a) 200\
   b) 201\
   c) 404\
   d) 500
   <details><summary>Show Answer</summary>Answer: c) 404<br><br>Explanation: The 404 status code indicates "Not Found," used when a requested resource doesn’t exist in a Node.js API. 200 (a) means success, 201 (b) indicates resource creation, and 500 (d) signals a server error, making them incorrect.</details>


8. **What is the purpose of the `jsonwebtoken` package in Node.js?**\
   a) To compress JSON data\
   b) To generate and verify JSON Web Tokens for authentication\
   c) To manage file system paths\
   d) To optimize database queries
   <details><summary>Show Answer</summary>Answer: b) To generate and verify JSON Web Tokens for authentication<br><br>Explanation: The `jsonwebtoken` package creates and verifies JWTs, commonly used for secure authentication in Node.js APIs. Options a, c, and d are incorrect as they refer to unrelated tasks handled by modules like `zlib`, `path`, or ORMs.</details>


9. **Which environment variable is typically used to specify the port for a Node.js server?**\
   a) NODE_ENV\
   b) PORT\
   c) HOST\
   d) DB_URL
   <details><summary>Show Answer</summary>Answer: b) PORT<br><br>Explanation: The `PORT` environment variable is conventionally used to set the port number for a Node.js server (e.g., `process.env.PORT`). `NODE_ENV` (a) sets the environment, `HOST` (c) specifies the host, and `DB_URL` (d) is for database connections, making them incorrect.</details>


10. **What is a key advantage of using TypeScript with Node.js?**\
    a) Faster runtime performance\
    b) Static type checking for better code reliability\
    c) Automatic database schema generation\
    d) Built-in WebSocket support
    <details><summary>Show Answer</summary>Answer: b) Static type checking for better code reliability<br><br>Explanation: TypeScript adds static type checking to Node.js, catching errors during development and improving code quality. It doesn’t improve runtime performance (a), generate schemas (c), or provide WebSocket support (d), making those options incorrect.</details>