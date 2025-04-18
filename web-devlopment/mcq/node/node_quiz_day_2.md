### Day 2 Node.js Multiple Choice Questions

1. **What is the purpose of the `process` object in Node.js?**\
   a) To handle HTTP requests\
   b) To provide information about the current Node.js process\
   c) To manage file system operations\
   d) To create new child processes
   <details><summary>Show Answer</summary>Answer: b) To provide information about the current Node.js process<br><br>Explanation: The `process` object is a global object in Node.js that provides information about the current runtime process, such as environment variables (`process.env`), command-line arguments, and process ID. Option a is incorrect as HTTP requests are handled by the `http` module. Option c relates to the `fs` module, and option d involves the `child_process` module, not the `process` object.</details>


2. **Which Node.js module is used to create an HTTP server?**\
   a) fs\
   b) http\
   c) url\
   d) net
   <details><summary>Show Answer</summary>Answer: b) http<br><br>Explanation: The `http` module in Node.js provides functionality to create and manage HTTP servers and clients, using methods like `http.createServer()`. The `fs` module (a) handles file operations, `url` (c) parses URLs, and `net` (d) is for TCP servers, not HTTP servers.</details>


3. **What does the `async/await` syntax in Node.js enable?**\
   a) Synchronous execution of code\
   b) Handling promises more cleanly\
   c) Creating new threads\
   d) Compiling JavaScript to machine code
   <details><summary>Show Answer</summary>Answer: b) Handling promises more cleanly<br><br>Explanation: The `async/await` syntax in Node.js simplifies working with promises, making asynchronous code look synchronous and easier to read. Option a is incorrect as `async/await` is for asynchronous code. Option c is wrong because Node.js is single-threaded by default, and option d relates to the V8 engine, not `async/await`.</details>


4. **Which method is used to install dependencies listed in `package.json`?**\
   a) npm start\
   b) npm install\
   c) npm run\
   d) npm build
   <details><summary>Show Answer</summary>Answer: b) npm install<br><br>Explanation: `npm install` downloads and installs dependencies listed in `package.json`. `npm start` (a) runs a script defined in `package.json`, `npm run` (c) executes custom scripts, and `npm build` (d) is not a standard npm command, making them incorrect.</details>


5. **What is the role of the `module.exports` object in Node.js?**\
   a) To import external modules\
   b) To define what a module exposes to other modules\
   c) To manage asynchronous callbacks\
   d) To configure the Node.js server
   <details><summary>Show Answer</summary>Answer: b) To define what a module exposes to other modules<br><br>Explanation: `module.exports` specifies what a Node.js module makes available when imported via `require()`. Importing modules (a) is done with `require()`, asynchronous callbacks (c) are unrelated, and server configuration (d) is handled by modules like `http`, not `module.exports`.</details>


6. **Which core module in Node.js is used to parse URLs?**\
   a) path\
   b) querystring\
   c) url\
   d) dns
   <details><summary>Show Answer</summary>Answer: c) url<br><br>Explanation: The `url` module in Node.js provides methods like `url.parse()` to parse and manipulate URLs. The `path` module (a) handles file paths, `querystring` (b) parses query strings (a URL component), and `dns` (d) is for domain name resolution, not URL parsing.</details>


7. **What does the `NODE_ENV` environment variable typically indicate?**\
   a) The version of Node.js installed\
   b) The runtime environment (e.g., development, production)\
   c) The location of the Node.js executable\
   d) The number of active Node.js processes
   <details><summary>Show Answer</summary>Answer: b) The runtime environment (e.g., development, production)<br><br>Explanation: `NODE_ENV` is an environment variable that indicates the runtime environment, such as `development` or `production`, affecting behavior like logging or optimization. Options a, c, and d are incorrect as they refer to unrelated aspects not managed by `NODE_ENV`.</details>


8. **Which of the following is a middleware framework commonly used with Node.js?**\
   a) React\
   b) Koa\
   c) Angular\
   d) Vue
   <details><summary>Show Answer</summary>Answer: b) Koa<br><br>Explanation: Koa is a lightweight Node.js middleware framework for building web applications, using modern JavaScript features. React (a), Angular (c), and Vue (d) are front-end frameworks, not middleware frameworks for Node.js.</details>


9. **What is the purpose of the `child_process` module in Node.js?**\
   a) To manage file compression\
   b) To execute external commands or spawn new processes\
   c) To handle HTTP client requests\
   d) To parse JSON data
   <details><summary>Show Answer</summary>Answer: b) To execute external commands or spawn new processes<br><br>Explanation: The `child_process` module allows Node.js to spawn new processes or execute external commands, useful for tasks like running scripts. File compression (a) uses `zlib`, HTTP requests (c) use `http`, and JSON parsing (d) uses `JSON`, making them incorrect.</details>


10. **How can you handle errors in a Node.js asynchronous function?**\
    a) Using try/catch with async/await\
    b) By restarting the Node.js server\
    c) Using synchronous callbacks\
    d) By modifying the package.json file
    <details><summary>Show Answer</summary>Answer: a) Using try/catch with async/await<br><br>Explanation: In Node.js, errors in asynchronous functions using `async/await` can be handled with `try/catch` blocks, catching rejected promises. Restarting the server (b) doesn’t handle errors, synchronous callbacks (c) are unrelated, and modifying `package.json` (d) is for configuration, not error handling.</details>