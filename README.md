# Selenium TestNG Practice Framework

A simple Selenium automation framework built using Java, TestNG, Maven, and Page Object Model (POM) with Page Factory.  
Created for hands-on practice of real-time automation concepts.

---

## Tools & Technologies
Java • Selenium • TestNG • Maven • Log4j2 • Extent Reports • GitHub • IntelliJ IDEA

---

## Project Structure
All automation code is maintained under `src/test/java`.

- **basePage** – Common reusable methods for page classes
- **baseTest** – Browser setup & teardown
- **pageClasses** – Page Object Model classes implemented using Page Factory
- **testScripts** – TestNG test cases
- **utilities** – Helper and utility classes

---

## TestNG XML Files
- **MultipleBrowserTestNG.xml** – Run tests on different browsers
- **ParallelExecutionTestNG.xml** – Parallel test execution
- **GroupsTest.xml** – Group-based execution
- **DataDrivenTesting.xml** – Runs tests with multiple data sets
- **ReportTest.xml** – Generates Extent Reports

---

## Features Practiced
- Page Object Model + Page Factory
- Parallel and multi-browser execution
- Grouping and parameterization
- Data-driven testing
- Screenshot capture on failure
- Basic logging using Log4j2
- Extent report generation

---

## Application Under Test
Automation is performed on a public demo e-commerce website used for practice:
- https://tutorialsninja.com/demo/

---

## How to Run the Project
1. Open the project in IntelliJ IDEA
2. Right-click on a test class or TestNG XML file
3. Select **Run**

---

## Author
**Sapana Ghodela**  
QA Engineer – Manual & Automation Testing
