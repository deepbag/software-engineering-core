### Day 1 Node.js Multiple Choice Questions

1. **What is Node.js primarily used for?**\
   a) Building user interfaces\
   b) Server-side JavaScript execution\
   c) Database management\
   d) Client-side scripting
   <details><summary>Show Answer</summary>Answer: b) Server-side JavaScript execution<br><br>Explanation: Node.js is a runtime environment that allows JavaScript to run on the server side, enabling the development of scalable backend applications. Option a is incorrect as building UIs is typically handled by front-end frameworks like React. Option c is wrong because Node.js is not a database management system, though it can interact with databases. Option d refers to client-side JavaScript, which runs in browsers, not Node.js.</details>


2. **Which module system does Node.js use by default?**\
   a) CommonJS\
   b) ES Modules\
   c) AMD\
   d) SystemJS
   <details><summary>Show Answer</summary>Answer: a) CommonJS<br><br>Explanation: Node.js uses CommonJS as its default module system, utilizing `require()` and `module.exports` for importing and exporting modules. ES Modules (b) are supported but not default in older Node.js versions. AMD (c) and SystemJS (d) are primarily used in browsers or other environments, not Node.js by default.</details>


3. **What is the purpose of the `npm` command in Node.js?**\
   a) To run JavaScript files\
   b) To manage packages and dependencies\
   c) To compile TypeScript\
   d) To create databases
   <details><summary>Show Answer</summary>Answer: b) To manage packages and dependencies<br><br>Explanation: `npm` (Node Package Manager) is used to install, manage, and publish packages and dependencies for Node.js projects. Running JavaScript files (a) is done with the `node` command. Compiling TypeScript (c) requires `tsc`, and creating databases (d) is handled by database systems, not npm.</details>


4. **Which core module in Node.js is used for handling file operations?**\
   a) http\
   b) fs\
   c) path\
   d) url
   <details><summary>Show Answer</summary>Answer: b) fs<br><br>Explanation: The `fs` (File System) module in Node.js provides methods for reading, writing, and manipulating files. The `http` module (a) is for creating servers, `path` (c) handles file paths, and `url` (d) parses URLs, making them incorrect for file operations.</details>


5. **What is the event loop in Node.js responsible for?**\
   a) Managing database connections\
   b) Handling asynchronous operations\
   c) Rendering HTML templates\
   d) Compiling JavaScript code
   <details><summary>Show Answer</summary>Answer: b) Handling asynchronous operations<br><br>Explanation: The event loop in Node.js manages asynchronous operations, such as callbacks, promises, and async/await, allowing non-blocking I/O. Database connections (a) are handled by specific modules, rendering templates (c) is a front-end or server-side rendering task, and compiling code (d) is done by the V8 engine, not the event loop.</details>


6. **Which of the following is a popular framework built on top of Node.js?**\
   a) Django\
   b) Express\
   c) Flask\
   d) Ruby on Rails
   <details><summary>Show Answer</summary>Answer: b) Express<br><br>Explanation: Express is a popular Node.js framework for building web applications and APIs. Django (a) and Flask (c) are Python frameworks, and Ruby on Rails (d) is a Ruby framework, making them incorrect as they are not built on Node.js.</details>


7. **What does the `require()` function do in Node.js?**\
   a) Exports a module\
   b) Imports a module\
   c) Defines a new function\
   d) Runs a server
   <details><summary>Show Answer</summary>Answer: b) Imports a module<br><br>Explanation: The `require()` function in Node.js imports modules, making their exported content available. Exporting a module (a) is done with `module.exports`, defining functions (c) is unrelated to `require()`, and running a server (d) involves modules like `http`, not `require()`.</details>


8. **Which command is used to initialize a new Node.js project?**\
   a) npm start\
   b) npm init\
   c) node run\
   d) node create
   <details><summary>Show Answer</summary>Answer: b) npm init<br><br>Explanation: `npm init` creates a `package.json` file to initialize a new Node.js project, setting up metadata and dependencies. `npm start` (a) runs a script, and `node run` (c) and `node create` (d) are not valid commands for project initialization.</details>


9. **What is the purpose of the `package.json` file in a Node.js project?**\
   a) To store HTML templates\
   b) To define project metadata and dependencies\
   c) To configure the server\
   d) To manage database schemas
   <details><summary>Show Answer</summary>Answer: b) To define project metadata and dependencies<br><br>Explanation: The `package.json` file stores project metadata (e.g., name, version) and lists dependencies managed by npm. HTML templates (a) are stored separately, server configuration (c) is done in code, and database schemas (d) are managed by database tools, not `package.json`.</details>


10. **Which of the following is true about Node.js?**\
    a) It is a front-end framework\
    b) It is single-threaded and non-blocking\
    c) It is primarily used for CSS preprocessing\
    d) It requires a browser to run
    <details><summary>Show Answer</summary>Answer: b) It is single-threaded and non-blocking<br><br>Explanation: Node.js is single-threaded and uses a non-blocking event loop for efficient asynchronous operations. It’s not a front-end framework (a), not used for CSS preprocessing (c), and runs on servers, not browsers (d), making those options incorrect.</details>