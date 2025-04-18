### Day 3 Node.js Multiple Choice Questions

1. **What is a stream in Node.js used for?**\
   a) To manage database connections\
   b) To handle data in chunks for efficient processing\
   c) To create new threads for parallel execution\
   d) To parse HTML templates
   <details><summary>Show Answer</summary>Answer: b) To handle data in chunks for efficient processing<br><br>Explanation: Streams in Node.js allow processing of data in chunks, improving memory efficiency for large datasets, such as reading files or handling HTTP requests. Database connections (a) are managed by database clients, threads (c) are handled by `worker_threads`, and HTML parsing (d) is unrelated, making them incorrect.</details>


2. **Which core module in Node.js is used to work with streams?**\
   a) fs\
   b) stream\
   c) http\
   d) util
   <details><summary>Show Answer</summary>Answer: b) stream<br><br>Explanation: The `stream` module provides the foundation for creating and manipulating streams in Node.js, including types like Readable and Writable. The `fs` module (a) uses streams but doesn’t define them, `http` (c) handles HTTP requests, and `util` (d) provides utility functions, not stream functionality.</details>


3. **What does the `cluster` module in Node.js enable?**\
   a) Load balancing HTTP requests\
   b) Running multiple Node.js processes to utilize CPU cores\
   c) Managing file system operations\
   d) Parsing query strings
   <details><summary>Show Answer</summary>Answer: b) Running multiple Node.js processes to utilize CPU cores<br><br>Explanation: The `cluster` module allows Node.js to fork multiple processes to leverage multi-core CPUs, improving performance for CPU-intensive tasks. Load balancing (a) may be a secondary effect but isn’t the primary purpose, while file operations (c) and query strings (d) are handled by `fs` and `querystring` modules, respectively.</details>


4. **How can you globally handle uncaught exceptions in Node.js?**\
   a) Using the `process.on('uncaughtException')` event\
   b) By wrapping all code in try/catch blocks\
   c) Using the `module.exports` object\
   d) By setting the NODE_ENV variable
   <details><summary>Show Answer</summary>Answer: a) Using the `process.on('uncaughtException')` event<br><br>Explanation: The `process.on('uncaughtException')` event listener catches unhandled exceptions globally, allowing logging or graceful shutdown. Try/catch (b) only works locally, `module.exports` (c) is for module exports, and `NODE_ENV` (d) sets the environment, not exception handling.</details>


5. **What is the purpose of the `debugger` statement in Node.js?**\
   a) To log errors to the console\
   b) To pause code execution for debugging\
   c) To optimize code performance\
   d) To export a module
   <details><summary>Show Answer</summary>Answer: b) To pause code execution for debugging<br><br>Explanation: The `debugger` statement pauses code execution when a debugger is attached, allowing inspection of variables and call stacks. Logging errors (a) uses `console.log`, optimization (c) is unrelated, and exporting modules (d) uses `module.exports`, making them incorrect.</details>


6. **Which tool is commonly used to debug Node.js applications?**\
   a) npm\
   b) Node Inspector\
   c) Express\
   d) pm2
   <details><summary>Show Answer</summary>Answer: b) Node Inspector<br><br>Explanation: Node Inspector is a debugging tool that integrates with Chrome DevTools to debug Node.js applications, offering breakpoints and variable inspection. `npm` (a) manages packages, Express (c) is a web framework, and `pm2` (d) manages processes, not debugging.</details>


7. **What does the `path.join()` method in the `path` module do?**\
   a) Splits a file path into segments\
   b) Combines path segments into a normalized path\
   c) Reads the contents of a file\
   d) Deletes a file from the system
   <details><summary>Show Answer</summary>Answer: b) Combines path segments into a normalized path<br><br>Explanation: `path.join()` combines multiple path segments into a single, normalized path, handling platform-specific separators. Splitting paths (a) uses `path.parse()`, reading files (c) uses `fs`, and deleting files (d) uses `fs.unlink()`, making them incorrect.</details>


8. **Which HTTP status code is typically returned by a Node.js server for a successful request?**\
   a) 404\
   b) 500\
   c) 200\
   d) 301
   <details><summary>Show Answer</summary>Answer: c) 200<br><br>Explanation: The 200 status code indicates a successful HTTP request in Node.js servers. 404 (a) means "Not Found," 500 (b) indicates a server error, and 301 (d) is for redirection, making them incorrect for a successful request.</details>


9. **What is the purpose of the `zlib` module in Node.js?**\
   a) To handle file system operations\
   b) To compress and decompress data\
   c) To manage network sockets\
   d) To parse JSON objects
   <details><summary>Show Answer</summary>Answer: b) To compress and decompress data<br><br>Explanation: The `zlib` module provides compression and decompression functionality, useful for tasks like gzipping HTTP responses. File operations (a) use `fs`, network sockets (c) use `net`, and JSON parsing (d) uses `JSON`, making them incorrect.</details>


10. **Which method is used to terminate a Node.js process programmatically?**\
    a) process.exit()\
    b) process.kill()\
    c) process.stop()\
    d) process.end()
    <details><summary>Show Answer</summary>Answer: a) process.exit()<br><br>Explanation: `process.exit()` terminates the Node.js process programmatically, optionally with an exit code. `process.kill()` (b) sends signals to processes, while `process.stop()` (c) and `process.end()` (d) are not valid methods in Node.js.</details>

