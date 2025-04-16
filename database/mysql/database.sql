-- Drop database if exist
DROP DATABASE IF EXISTS it;
-- Create the it database if it does not already exist with UTF-8 support
CREATE DATABASE IF NOT EXISTS it
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

-- Use the it database for the following operations
USE it;

-- Table: companies
-- Purpose: Stores information about companies, including their name and unique registration number
CREATE TABLE companies (
  id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each company
  name VARCHAR(255) NOT NULL, -- Company name
  registration_number VARCHAR(100) UNIQUE NOT NULL, -- Unique registration number for the company
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp when the company record was created
  INDEX idx_company_name (name) -- Index for faster searches on company name
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Table: branches
-- Purpose: Stores information about company branches, linked to a specific company
CREATE TABLE branches (
  id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each branch
  company_id INT NOT NULL, -- Foreign key referencing the parent company
  name VARCHAR(255) NOT NULL, -- Branch name
  city VARCHAR(100), -- City of the branch location (optional)
  state VARCHAR(100), -- State or region of the branch location (optional)
  country VARCHAR(100), -- Country of the branch location (optional)
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp when the branch record was created
  FOREIGN KEY (company_id) REFERENCES companies(id) ON DELETE CASCADE, -- Deletes branch if parent company is deleted
  INDEX idx_branch_name (name) -- Index for faster searches on branch name
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Table: departments
-- Purpose: Stores information about departments within branches
CREATE TABLE departments (
  id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each department
  branch_id INT NOT NULL, -- Foreign key referencing the parent branch
  name VARCHAR(255) NOT NULL, -- Department name
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp when the department record was created
  FOREIGN KEY (branch_id) REFERENCES branches(id) ON DELETE CASCADE, -- Deletes department if parent branch is deleted
  INDEX idx_department_name (name) -- Index for faster searches on department name
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Table: employees
-- Purpose: Stores information about employees, linked to a department (which implies branch and company)
CREATE TABLE employees (
  id INT AUTO_INCREMENT PRIMARY KEY,
  department_id INT NOT NULL,
  first_name VARCHAR(100) NOT NULL,
  last_name VARCHAR(100) NOT NULL,
  email VARCHAR(255) UNIQUE NOT NULL,
  phone VARCHAR(20) UNIQUE,
  hire_date DATE NOT NULL,
  salary DECIMAL(10,2) CHECK (salary >= 0 OR salary IS NULL),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (department_id) REFERENCES departments(id) ON DELETE CASCADE
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Table: projects
-- Purpose: Stores project details for each company, including status and timestamps
CREATE TABLE projects (
  id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each project
  company_id INT NOT NULL, -- Foreign key referencing the parent company
  name VARCHAR(255) NOT NULL, -- Project name
  description TEXT, -- Optional project description
  status ENUM('upcoming', 'ongoing', 'completed') DEFAULT 'upcoming', -- Status of the project
  start_date DATE, -- When the project started (nullable for upcoming projects)
  end_date DATE, -- When the project was completed (nullable for ongoing or upcoming projects)
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp when the project record was created
  FOREIGN KEY (company_id) REFERENCES companies(id) ON DELETE CASCADE, -- Deletes project if parent company is deleted
  INDEX idx_project_name (name), -- Index for faster searches on project name
  INDEX idx_project_status (status) -- Index to filter by project status
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Table: timesheets
-- Purpose: Stores timesheet entries filled by employees indicating hours worked on specific projects
CREATE TABLE timesheets (
  id INT AUTO_INCREMENT PRIMARY KEY, -- Unique identifier for each timesheet entry
  employee_id INT NOT NULL, -- Foreign key referencing the employee
  project_id INT NOT NULL, -- Foreign key referencing the project
  week_ending DATE NOT NULL, -- The Friday (week ending date) the timesheet is for
  hours_worked DECIMAL(5,2) NOT NULL CHECK (hours_worked >= 0 AND hours_worked <= 168), -- Total hours worked, max 168 (24*7)
  notes TEXT, -- Optional notes from the employee
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP, -- Timestamp when the timesheet was created
  FOREIGN KEY (employee_id) REFERENCES employees(id) ON DELETE CASCADE, -- Deletes timesheet if employee is deleted
  FOREIGN KEY (project_id) REFERENCES projects(id) ON DELETE CASCADE, -- Deletes timesheet if project is deleted
  INDEX idx_week_ending (week_ending) -- Index for filtering by week ending
) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- Note: ON DELETE CASCADE is used throughout to maintain referential integrity, but be cautious as deleting a company
-- will cascade to delete all related branches, departments, and employees.

-- Insert sample data into companies (10 companies)
INSERT INTO companies (name, registration_number) VALUES
  ('TechCorp', 'TC123456789'),
  ('Innovate Ltd', 'IL987654321'),
  ('Global Solutions', 'GS456789123'),
  ('FutureTech', 'FT789123456'),
  ('Alpha Industries', 'AI123789456'),
  ('Beta Systems', 'BS456123789'),
  ('Gamma Enterprises', 'GE789456123'),
  ('Delta Dynamics', 'DD123456987'),
  ('Omega Group', 'OG987123456'),
  ('Sigma Solutions', 'SS456789321');

-- Insert sample data into branches (15 branches across 10 companies)
INSERT INTO branches (company_id, name, city, state, country) VALUES
  (1, 'TechCorp HQ', 'San Francisco', 'California', 'USA'), -- TechCorp
  (1, 'TechCorp East', 'New York', 'New York', 'USA'), -- TechCorp
  (2, 'Innovate Main', 'London', NULL, 'UK'), -- Innovate Ltd
  (2, 'Innovate West', 'Manchester', NULL, 'UK'), -- Innovate Ltd
  (3, 'Global Solutions HQ', 'Chicago', 'Illinois', 'USA'), -- Global Solutions
  (4, 'FutureTech Main', 'Tokyo', NULL, 'Japan'), -- FutureTech
  (4, 'FutureTech North', 'Osaka', NULL, 'Japan'), -- FutureTech
  (5, 'Alpha Industries HQ', 'Berlin', NULL, 'Germany'), -- Alpha Industries
  (6, 'Beta Systems Main', 'Sydney', 'New South Wales', 'Australia'), -- Beta Systems
  (6, 'Beta Systems South', 'Melbourne', 'Victoria', 'Australia'), -- Beta Systems
  (7, 'Gamma Enterprises HQ', 'Toronto', 'Ontario', 'Canada'), -- Gamma Enterprises
  (8, 'Delta Dynamics Main', 'Paris', NULL, 'France'), -- Delta Dynamics
  (9, 'Omega Group HQ', 'Singapore', NULL, 'Singapore'), -- Omega Group
  (9, 'Omega Group East', 'Hong Kong', NULL, 'Hong Kong'), -- Omega Group
  (10, 'Sigma Solutions Main', 'Austin', 'Texas', 'USA'); -- Sigma Solutions

-- Insert sample data into departments (20 departments across 15 branches)
INSERT INTO departments (branch_id, name) VALUES
  (1, 'Engineering'), -- TechCorp HQ
  (1, 'HR'), -- TechCorp HQ
  (2, 'Sales'), -- TechCorp East
  (2, 'Marketing'), -- TechCorp East
  (3, 'R&D'), -- Innovate Main
  (3, 'Finance'), -- Innovate Main
  (4, 'Operations'), -- Innovate West
  (5, 'IT'), -- Global Solutions HQ
  (5, 'Customer Support'), -- Global Solutions HQ
  (6, 'Development'), -- FutureTech Main
  (7, 'Engineering'), -- FutureTech North
  (8, 'Production'), -- Alpha Industries HQ
  (8, 'Quality Assurance'), -- Alpha Industries HQ
  (9, 'Software'), -- Beta Systems Main
  (10, 'Support'), -- Beta Systems South
  (11, 'Research'), -- Gamma Enterprises HQ
  (12, 'Logistics'), -- Delta Dynamics Main
  (13, 'Analytics'), -- Omega Group HQ
  (14, 'Sales'), -- Omega Group East
  (15, 'DevOps'); -- Sigma Solutions Main

-- Insert sample data into employees (30 employees across 20 departments)
INSERT INTO employees (department_id, first_name, last_name, email, phone, hire_date, salary) VALUES
  (1, 'Alice', 'Smith', 'alice.smith@techcorp.com', '555-0101', '2023-01-15', 95000.00), -- Engineering, TechCorp HQ
  (1, 'Bob', 'Johnson', 'bob.johnson@techcorp.com', '555-0102', '2022-06-20', 100000.00), -- Engineering, TechCorp HQ
  (2, 'Carol', 'Williams', 'carol.williams@techcorp.com', NULL, '2021-09-10', 75000.00), -- HR, TechCorp HQ
  (3, 'David', 'Brown', 'david.brown@techcorp.com', '555-0103', '2023-03-05', 85000.00), -- Sales, TechCorp East
  (3, 'Eve', 'Jones', 'eve.jones@techcorp.com', '555-0104', '2022-11-01', 90000.00), -- Sales, TechCorp East
  (4, 'Frank', 'Davis', 'frank.davis@techcorp.com', NULL, '2023-07-15', 80000.00), -- Marketing, TechCorp East
  (5, 'Grace', 'Wilson', 'grace.wilson@innovate.com', '555-0105', '2024-02-01', 110000.00), -- R&D, Innovate Main
  (5, 'Henry', 'Taylor', 'henry.taylor@innovate.com', '555-0106', '2023-05-10', NULL), -- R&D, Innovate Main
  (6, 'Isabella', 'Moore', 'isabella.moore@innovate.com', '555-0107', '2022-08-20', 95000.00), -- Finance, Innovate Main
  (7, 'James', 'Anderson', 'james.anderson@innovate.com', NULL, '2023-12-05', 70000.00), -- Operations, Innovate West
  (8, 'Kelly', 'Thomas', 'kelly.thomas@globalsol.com', '555-0108', '2023-04-15', 85000.00), -- IT, Global Solutions HQ
  (9, 'Liam', 'Jackson', 'liam.jackson@globalsol.com', '555-0109', '2022-10-10', 90000.00), -- Customer Support, Global Solutions HQ
  (10, 'Mia', 'White', 'mia.white@futuretech.com', NULL, '2023-06-01', 120000.00), -- Development, FutureTech Main
  (11, 'Noah', 'Harris', 'noah.harris@futuretech.com', '555-0110', '2024-01-20', 105000.00), -- Engineering, FutureTech North
  (12, 'Olivia', 'Martin', 'olivia.martin@alphaind.com', '555-0111', '2023-02-25', 95000.00), -- Production, Alpha Industries HQ
  (12, 'Peter', 'Thompson', 'peter.thompson@alphaind.com', NULL, '2022-09-15', NULL), -- Production, Alpha Industries HQ
  (13, 'Quinn', 'Garcia', 'quinn.garcia@alphaind.com', '555-0112', '2023-11-10', 80000.00), -- Quality Assurance, Alpha Industries HQ
  (14, 'Rachel', 'Martinez', 'rachel.martinez@betasys.com', '555-0113', '2023-03-20', 100000.00), -- Software, Beta Systems Main
  (15, 'Samuel', 'Robinson', 'samuel.robinson@betasys.com', NULL, '2022-12-01', 75000.00), -- Support, Beta Systems South
  (16, 'Tara', 'Clark', 'tara.clark@gammaent.com', '555-0114', '2023-07-05', 110000.00), -- Research, Gamma Enterprises HQ
  (16, 'Uma', 'Rodriguez', 'uma.rodriguez@gammaent.com', '555-0115', '2023-09-10', 95000.00), -- Research, Gamma Enterprises HQ
  (17, 'Victor', 'Lewis', 'victor.lewis@deltadyn.com', NULL, '2023-04-01', 85000.00), -- Logistics, Delta Dynamics Main
  (17, 'Wendy', 'Lee', 'wendy.lee@deltadyn.com', '555-0116', '2022-11-20', 90000.00), -- Logistics, Delta Dynamics Main
  (18, 'Xavier', 'Walker', 'xavier.walker@omegagroup.com', '555-0117', '2023-06-15', 105000.00), -- Analytics, Omega Group HQ
  (19, 'Yara', 'Hall', 'yara.hall@omegagroup.com', NULL, '2023-01-10', 95000.00), -- Sales, Omega Group East
  (19, 'Zane', 'Allen', 'zane.allen@omegagroup.com', '555-0118', '2022-08-05', 90000.00), -- Sales, Omega Group East
  (20, 'Amelia', 'Young', 'amelia.young@sigmasol.com', '555-0119', '2023-10-01', 100000.00), -- DevOps, Sigma Solutions Main
  (20, 'Ben', 'King', 'ben.king@sigmasol.com', NULL, '2023-05-15', NULL), -- DevOps, Sigma Solutions Main
  (20, 'Clara', 'Wright', 'clara.wright@sigmasol.com', '555-0120', '2022-07-10', 95000.00), -- DevOps, Sigma Solutions Main
  (20, 'Daniel', 'Scott', 'daniel.scott@sigmasol.com', '555-0121', '2023-12-15', 110000.00); -- DevOps, Sigma Solutions Main

-- Insert sample data into projects (20 projects across 10 companies)
INSERT INTO projects (company_id, name, description, status, start_date, end_date) VALUES
  (1, 'TechCorp AI Platform', 'Developing an AI-driven analytics platform', 'ongoing', '2024-03-01', NULL), -- TechCorp
  (1, 'TechCorp Cloud Migration', 'Migrating legacy systems to cloud', 'completed', '2023-06-01', '2023-12-15'), -- TechCorp
  (2, 'Innovate Mobile App', 'Building a customer-facing mobile app', 'ongoing', '2024-01-15', NULL), -- Innovate Ltd
  (2, 'Innovate ERP System', 'Implementing a new ERP system', 'upcoming', NULL, NULL), -- Innovate Ltd
  (3, 'Global CRM Upgrade', 'Upgrading CRM for better customer insights', 'ongoing', '2024-02-10', NULL), -- Global Solutions
  (3, 'Global Data Warehouse', 'Creating a centralized data warehouse', 'completed', '2023-04-01', '2023-10-30'), -- Global Solutions
  (4, 'FutureTech IoT Solution', 'Developing IoT devices for smart homes', 'ongoing', '2024-05-01', NULL), -- FutureTech
  (4, 'FutureTech VR Training', 'VR-based employee training program', 'upcoming', NULL, NULL), -- FutureTech
  (5, 'Alpha Automation', 'Automating production line processes', 'ongoing', '2024-04-15', NULL), -- Alpha Industries
  (5, 'Alpha Green Initiative', 'Sustainability project for factories', 'completed', '2023-07-01', '2024-01-20'), -- Alpha Industries
  (6, 'Beta Cybersecurity Suite', 'Developing advanced cybersecurity tools', 'ongoing', '2024-03-20', NULL), -- Beta Systems
  (6, 'Beta Cloud Backup', 'Cloud-based backup solution', 'completed', '2023-05-15', '2023-11-10'), -- Beta Systems
  (7, 'Gamma AI Research', 'Research into AI for healthcare', 'ongoing', '2024-06-01', NULL), -- Gamma Enterprises
  (7, 'Gamma Supply Chain', 'Optimizing supply chain logistics', 'upcoming', NULL, NULL), -- Gamma Enterprises
  (8, 'Delta Robotics', 'Robotics for warehouse automation', 'ongoing', '2024-02-01', NULL), -- Delta Dynamics
  (8, 'Delta Inventory System', 'New inventory management system', 'completed', '2023-08-01', '2024-03-15'), -- Delta Dynamics
  (9, 'Omega FinTech App', 'Mobile app for financial services', 'ongoing', '2024-04-01', NULL), -- Omega Group
  (9, 'Omega Blockchain', 'Blockchain for secure transactions', 'upcoming', NULL, NULL), -- Omega Group
  (10, 'Sigma DevOps Pipeline', 'Automated CI/CD pipeline', 'ongoing', '2024-01-10', NULL), -- Sigma Solutions
  (10, 'Sigma Monitoring Tool', 'Real-time system monitoring tool', 'completed', '2023-09-01', '2024-02-28'); -- Sigma Solutions

-- Insert sample data into timesheets (40 timesheet entries for employees on projects)
INSERT INTO timesheets (employee_id, project_id, week_ending, hours_worked, notes) VALUES
  (1, 1, '2024-03-08', 40.00, 'Worked on AI model training'), -- Alice Smith, TechCorp AI Platform
  (1, 1, '2024-03-15', 35.50, 'Debugged model inference issues'), -- Alice Smith, TechCorp AI Platform
  (2, 1, '2024-03-08', 38.00, 'Designed API endpoints'), -- Bob Johnson, TechCorp AI Platform
  (4, 2, '2023-12-08', 40.00, 'Finalized cloud migration scripts'), -- David Brown, TechCorp Cloud Migration
  (5, 2, '2023-12-08', 30.00, 'Tested migration for sales module'), -- Eve Jones, TechCorp Cloud Migration
  (7, 3, '2024-01-19', 40.00, 'Developed app UI components'), -- Grace Wilson, Innovate Mobile App
  (8, 3, '2024-01-19', 25.00, 'Researched backend frameworks'), -- Henry Taylor, Innovate Mobile App
  (9, 3, '2024-01-26', 20.00, 'Prepared budget reports'), -- Isabella Moore, Innovate Mobile App
  (11, 5, '2024-02-16', 40.00, 'Integrated CRM APIs'), -- Kelly Thomas, Global CRM Upgrade
  (12, 5, '2024-02-16', 35.00, 'Resolved customer tickets'), -- Liam Jackson, Global CRM Upgrade
  (12, 6, '2023-10-27', 40.00, 'Loaded historical data'), -- Liam Jackson, Global Data Warehouse
  (13, 7, '2024-05-03', 40.00, 'Prototyped IoT firmware'), -- Mia White, FutureTech IoT Solution
  (14, 7, '2024-05-03', 38.00, 'Designed circuit boards'), -- Noah Harris, FutureTech IoT Solution
  (15, 9, '2024-04-19', 40.00, 'Programmed PLCs for automation'), -- Olivia Martin, Alpha Automation
  (16, 9, '2024-04-19', 30.00, 'Tested automation workflows'), -- Peter Thompson, Alpha Automation
  (17, 10, '2024-01-12', 35.00, 'Audited factory emissions'), -- Quinn Garcia, Alpha Green Initiative
  (18, 11, '2024-03-22', 40.00, 'Developed encryption module'), -- Rachel Martinez, Beta Cybersecurity Suite
  (19, 11, '2024-03-22', 20.00, 'Updated support docs'), -- Samuel Robinson, Beta Cybersecurity Suite
  (18, 12, '2023-11-03', 40.00, 'Tested backup recovery'), -- Rachel Martinez, Beta Cloud Backup
  (20, 13, '2024-06-07', 40.00, 'Analyzed medical datasets'), -- Tara Clark, Gamma AI Research
  (21, 13, '2024-06-07', 35.00, 'Wrote research paper'), -- Uma Rodriguez, Gamma AI Research
  (22, 15, '2024-02-09', 40.00, 'Programmed robotic arms'), -- Victor Lewis, Delta Robotics
  (23, 15, '2024-02-09', 38.00, 'Calibrated sensors'), -- Wendy Lee, Delta Robotics
  (23, 16, '2024-03-08', 40.00, 'Deployed inventory system'), -- Wendy Lee, Delta Inventory System
  (24, 17, '2024-04-05', 40.00, 'Coded payment gateway'), -- Xavier Walker, Omega FinTech App
  (25, 17, '2024-04-05', 30.00, 'Analyzed user data'), -- Yara Hall, Omega FinTech App
  (26, 17, '2024-04-12', 35.00, 'Designed UX for app'), -- Zane Allen, Omega FinTech App
  (27, 19, '2024-01-12', 40.00, 'Set up Jenkins pipelines'), -- Amelia Young, Sigma DevOps Pipeline
  (28, 19, '2024-01-12', 38.00, 'Configured Kubernetes'), -- Ben King, Sigma DevOps Pipeline
  (29, 19, '2024-01-19', 40.00, 'Wrote deployment scripts'), -- Clara Wright, Sigma DevOps Pipeline
  (30, 19, '2024-01-19', 35.00, 'Optimized build times'), -- Daniel Scott, Sigma DevOps Pipeline
  (27, 20, '2024-02-23', 40.00, 'Integrated Prometheus'), -- Amelia Young, Sigma Monitoring Tool
  (28, 20, '2024-02-23', 38.00, 'Set up Grafana dashboards'), -- Ben King, Sigma Monitoring Tool
  (1, 1, '2024-03-22', 40.00, 'Optimized AI algorithms'), -- Alice Smith, TechCorp AI Platform
  (2, 1, '2024-03-22', 35.00, 'Refactored backend code'), -- Bob Johnson, TechCorp AI Platform
  (7, 3, '2024-01-26', 40.00, 'Tested app features'), -- Grace Wilson, Innovate Mobile App
  (11, 5, '2024-02-23', 38.00, 'Updated CRM database'), -- Kelly Thomas, Global CRM Upgrade
  (13, 7, '2024-05-10', 40.00, 'Improved IoT connectivity'), -- Mia White, FutureTech IoT Solution
  (15, 9, '2024-04-26', 35.00, 'Debugged automation bugs'), -- Olivia Martin, Alpha Automation
  (20, 13, '2024-06-14', 40.00, 'Trained AI models'), -- Tara Clark, Gamma AI Research
  (27, 19, '2024-01-26', 40.00, 'Automated testing'), -- Amelia Young, Sigma DevOps Pipeline
  (29, 20, '2024-02-16', 35.00, 'Added alert rules'), -- Clara Wright, Sigma Monitoring Tool
  (30, 20, '2024-02-16', 40.00, 'Finalized monitoring tool'); -- Daniel Scott, Sigma Monitoring Tool