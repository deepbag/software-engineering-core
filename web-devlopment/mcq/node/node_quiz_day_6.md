### Day 6 Node.js Multiple Choice Questions

1. **What is distributed tracing in Node.js applications used for?**\
   a) Managing database schemas\
   b) Monitoring request flow across microservices\
   c) Compiling JavaScript code\
   d) Rendering HTML templates
   <details><summary>Show Answer</summary>Answer: b) Monitoring request flow across microservices<br><br>Explanation: Distributed tracing tracks requests across microservices, aiding performance analysis with tools like OpenTelemetry. Database schemas (a) are managed by ORMs, compilation (c) is handled by V8, and rendering (d) is unrelated.</details>


2. **Which package enhances Express with advanced routing capabilities?**\
   a) Express-router\
   b) Router\
   c) Morgan\
   d) Multer
   <details><summary>Show Answer</summary>Answer: b) Router<br><br>Explanation: The `Router` class in Express provides advanced routing for modular route handling. Express-router (a) isn’t a package, Morgan (c) is for logging, and Multer (d) handles file uploads.</details>


3. **What is the benefit of using Docker with Node.js applications?**\
   a) Faster JavaScript execution\
   b) Consistent environments across development and production\
   c) Built-in database management\
   d) Client-side rendering
   <details><summary>Show Answer</summary>Answer: b) Consistent environments across development and production<br><br>Explanation: Docker ensures consistent environments for Node.js apps via containers. It doesn’t speed up execution (a), manage databases (c), or handle rendering (d).</details>


4. **Which Node.js package integrates with RabbitMQ for message queues?**\
   a) Amqplib\
   b) Winston\
   c) Helmet\
   d) Supertest
   <details><summary>Show Answer</summary>Answer: a) Amqplib<br><br>Explanation: `amqplib` enables Node.js to work with RabbitMQ for message queueing. Winston (b) is for logging, Helmet (c) secures headers, and Supertest (d) is for API testing.</details>


5. **What does the `diagnostics_channel` module in Node.js provide?**\
   a) File system diagnostics\
   b) A way to publish and subscribe to diagnostic data\
   c) HTTP request routing\
   d) Password encryption
   <details><summary>Show Answer</summary>Answer: b) A way to publish and subscribe to diagnostic data<br><br>Explanation: `diagnostics_channel` allows publishing and subscribing to diagnostic data for observability. File diagnostics (a) use `fs`, routing (c) uses Express, and encryption (d) uses `crypto`.</details>


6. **Which strategy improves Node.js application scalability?**\
   a) Using synchronous functions\
   b) Implementing horizontal scaling with clustering\
   c) Disabling the event loop\
   d) Storing data in package.json
   <details><summary>Show Answer</summary>Answer: b) Implementing horizontal scaling with clustering<br><br>Explanation: Horizontal scaling with the `cluster` module distributes workload across processes, improving scalability. Synchronous functions (a) block execution, the event loop (c) is essential, and package.json (d) is for metadata.</details>


7. **What is the purpose of the `assert` module in Node.js?**\
   a) To manage HTTP servers\
   b) To perform runtime assertions for testing\
   c) To compress files\
   d) To parse URLs
   <details><summary>Show Answer</summary>Answer: b) To perform runtime assertions for testing<br><br>Explanation: The `assert` module provides functions for runtime assertions, useful in testing. HTTP servers (a) use `http`, compression (c) uses `zlib`, and URLs (d) use `url`.</details>


8. **Which HTTP status code indicates a Node.js request timeout?**\
   a) 200\
   b) 408\
   c) 500\
   d) 403
   <details><summary>Show Answer</summary>Answer: b) 408<br><br>Explanation: The 408 status code indicates a request timeout in Node.js APIs. 200 (a) is success, 500 (c) is a server error, and 403 (d) means forbidden.</details>


9. **What is the benefit of using a CDN with a Node.js application?**\
   a) Faster database queries\
   b) Reduced latency for static assets\
   c) Automatic code minification\
   d) Enhanced password security
   <details><summary>Show Answer</summary>Answer: b) Reduced latency for static assets<br><br>Explanation: A CDN caches static assets closer to users, reducing latency. It doesn’t affect queries (a), minify code (c), or secure passwords (d).</details>


10. **What does the `vm` module in Node.js allow?**\
    a) Virtual machine creation for containers\
    b) Running JavaScript in isolated contexts\
    c) Managing network sockets\
    d) Handling file uploads
    <details><summary>Show Answer</summary>Answer: b) Running JavaScript in isolated contexts<br><br>Explanation: The `vm` module executes JavaScript in isolated contexts, useful for sandboxing. Containers (a) use Docker, sockets (c) use `net`, and uploads (d) use Multer.</details>