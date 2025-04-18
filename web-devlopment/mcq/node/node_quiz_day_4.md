### Day 4 Node.js Multiple Choice Questions

1. **What is middleware in the context of a Node.js application?**\
   a) A database management tool\
   b) A function that processes requests and responses in a pipeline\
   c) A module for file compression\
   d) A front-end rendering engine
   <details><summary>Show Answer</summary>Answer: b) A function that processes requests and responses in a pipeline<br><br>Explanation: Middleware in Node.js, especially in frameworks like Express, is a function that sits between the incoming request and the outgoing response. It can modify the request/response objects, perform authentication, logging, or pass control to the next middleware using `next()`. Options a, c, and d are incorrect as they refer to unrelated functionalities.</details>


2. **Which Express middleware is commonly used to parse incoming JSON payloads?**\
   a) express.static()\
   b) express.json()\
   c) express.urlencoded()\
   d) express.router()
   <details><summary>Show Answer</summary>Answer: b) express.json()<br><br>Explanation: `express.json()` is a built-in middleware in Express that parses incoming requests with JSON payloads, making the data available in `req.body`. `express.static()` serves static files, `express.urlencoded()` parses URL-encoded data, and `express.router()` is for routing, not JSON parsing.</details>


3. **What does the `cors` package in Node.js enable?**\
   a) Cross-Origin Resource Sharing for APIs\
   b) Compression of HTTP responses\
   c) Connection to SQL databases\
   d) Creation of child processes
   <details><summary>Show Answer</summary>Answer: a) Cross-Origin Resource Sharing for APIs<br><br>Explanation: The `cors` package allows servers to specify which origins can access their resources, enabling safe cross-origin requests for APIs. Options b, c, and d are incorrect as they refer to unrelated functionalities like compression (`zlib`), database connections, or process management (`child_process`).</details>


4. **Which HTTP method is typically used to update resources in a REST API built with Node.js?**\
   a) GET\
   b) POST\
   c) PUT\
   d) DELETE
   <details><summary>Show Answer</summary>Answer: c) PUT<br><br>Explanation: In REST APIs, `PUT` is used to update existing resources by replacing them with new data. `GET` retrieves data, `POST` creates new resources, and `DELETE` removes resources, making them incorrect for updating.</details>


5. **What is the purpose of the `helmet` package in a Node.js application?**\
   a) To optimize database queries\
   b) To secure HTTP headers for better security\
   c) To manage session authentication\
   d) To handle file uploads
   <details><summary>Show Answer</summary>Answer: b) To secure HTTP headers for better security<br><br>Explanation: `helmet` is a collection of middleware functions that set HTTP headers to protect against common vulnerabilities, like XSS or clickjacking. Options a, c, and d are incorrect as they refer to unrelated tasks handled by other tools or modules.</details>


6. **How can you improve performance in a Node.js application handling heavy computations?**\
   a) Using synchronous functions\
   b) Offloading tasks to worker threads\
   c) Increasing the number of middleware functions\
   d) Disabling the event loop
   <details><summary>Show Answer</summary>Answer: b) Offloading tasks to worker threads<br><br>Explanation: Heavy computations can block Node.js’s single-threaded event loop. The `worker_threads` module allows offloading tasks to separate threads, improving performance. Synchronous functions (a) block the event loop, more middleware (c) adds overhead, and disabling the event loop (d) is not feasible.</details>

7. **Which module is used to hash passwords securely in Node.js?**\
   a) crypto\
   b) bcrypt\
   c) zlib\
   d) querystring
   <details><summary>Show Answer</summary>Answer: b) bcrypt<br><br>Explanation: `bcrypt` is a specialized library for securely hashing passwords using strong algorithms. While `crypto` (a) offers hashing, it’s less suited for passwords. `zlib` (c) is for compression, and `querystring` (d) parses query strings, making them incorrect.</details>


8. **What does the `next()` function do in Express middleware?**\
   a) Terminates the HTTP request\
   b) Passes control to the next middleware function\
   c) Sends a response to the client\
   d) Restarts the server
   <details><summary>Show Answer</summary>Answer: b) Passes control to the next middleware function<br><br>Explanation: In Express, `next()` is called to pass control to the next middleware in the stack. Not calling it halts the pipeline. Options a, c, and d are incorrect as `next()` doesn’t terminate requests, send responses, or restart servers.</details>


9. **Which of the following is a best practice for handling errors in a Node.js REST API?**\
   a) Logging errors to the console only\
   b) Using a centralized error-handling middleware\
   c) Ignoring errors to prevent crashes\
   d) Returning raw error objects to clients
   <details><summary>Show Answer</summary>Answer: b) Using a centralized error-handling middleware<br><br>Explanation: A centralized error-handling middleware in Express (e.g., with four parameters: err, req, res, next) ensures consistent error responses and logging. Logging only (a) lacks response handling, ignoring errors (c) is risky, and returning raw errors (d) exposes sensitive data.</details>


10. **What is the role of the `dotenv` package in a Node.js project?**\
    a) To manage database migrations\
    b) To load environment variables from a .env file\
    c) To bundle JavaScript files\
    d) To monitor server performance
    <details><summary>Show Answer</summary>Answer: b) To load environment variables from a .env file<br><br>Explanation: The `dotenv` package loads environment variables from a `.env` file into `process.env`, simplifying configuration management. Options a, c, and d are incorrect as they refer to unrelated tasks like database migrations, bundling (e.g., Webpack), or monitoring (e.g., PM2).</details>