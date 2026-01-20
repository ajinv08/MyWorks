How to use Antigravity to create a Java Selenium BDD Cucumber Test Automation Framework with all major utilities and scalable enterprise level project.

Open Antigravity. Give the below prompt. 

Antigravity Prompt: Java Selenium BDD Cucumber Framework

Role:
You are a Senior QA Automation Architect designing an enterprise-grade Java Selenium Test Automation Framework using BDD with Cucumber.

Objective:
Create a production-ready, scalable, maintainable automation framework suitable for large teams, CI/CD pipelines, and multiple environments.

🔸 Tech Stack & Standards

Language: Java (Java 17 preferred)

Build Tool: Maven

Automation Tool: Selenium WebDriver

BDD: Cucumber (Gherkin feature files)

Test Runner: TestNG

Design Patterns: Page Object Model (POM), Factory Pattern

Dependency Injection: PicoContainer or similar

Logging: Log4j2

Reporting: Allure + Cucumber HTML Reports

Assertions: TestNG / AssertJ

Config Management: Properties / YAML based

Parallel Execution: Supported via TestNG

CI/CD Ready: Jenkins / GitHub Actions compatible

Version Control Friendly: Git-ready structure

🔸 Expected Project Folder Structure
project-root
│
├── pom.xml
├── README.md
├── .gitignore
│
├── src
│   ├── main
│   │   └── java
│   │       └── framework
│   │           ├── config
│   │           │   ├── ConfigLoader.java
│   │           │   └── Environment.java
│   │           │
│   │           ├── constants
│   │           │   └── FrameworkConstants.java
│   │           │
│   │           ├── driver
│   │           │   ├── DriverFactory.java
│   │           │   ├── DriverManager.java
│   │           │   └── BrowserFactory.java
│   │           │
│   │           ├── enums
│   │           │   ├── BrowserType.java
│   │           │   └── WaitStrategy.java
│   │           │
│   │           ├── exceptions
│   │           │   └── FrameworkException.java
│   │           │
│   │           ├── utilities
│   │           │   ├── WaitUtils.java
│   │           │   ├── ElementUtils.java
│   │           │   ├── ScreenshotUtils.java
│   │           │   ├── PropertyUtils.java
│   │           │   ├── JsonUtils.java
│   │           │   ├── ExcelUtils.java
│   │           │   └── LoggerUtils.java
│   │           │
│   │           └── listeners
│   │               ├── TestNGListener.java
│   │               └── CucumberListener.java
│
│   ├── test
│   │   ├── java
│   │   │   ├── stepdefinitions
│   │   │   │   └── LoginSteps.java
│   │   │   │
│   │   │   ├── runners
│   │   │   │   └── CucumberTestRunner.java
│   │   │   │
│   │   │   ├── hooks
│   │   │   │   └── Hooks.java
│   │   │   │
│   │   │   └── pages
│   │   │       ├── BasePage.java
│   │   │       └── LoginPage.java
│   │   │
│   │   └── resources
│   │       ├── features
│   │       │   └── login.feature
│   │       │
│   │       ├── config
│   │       │   ├── config.properties
│   │       │   ├── dev.properties
│   │       │   ├── qa.properties
│   │       │   └── prod.properties
│   │       │
│   │       ├── testng.xml
│   │       └── log4j2.xml
│
├── reports
│   ├── allure-results
│   └── cucumber-reports
│
└── .github / .jenkins

🔸 Core Functional Expectations

Driver Management

Thread-safe WebDriver using ThreadLocal

Support Chrome, Firefox, Edge

Headless execution toggle

BDD Implementation

Clean Gherkin feature files

Reusable step definitions

Hooks for setup/teardown

Tag-based execution

Utilities

Explicit wait handling via strategy enum

Screenshot capture on failure

Environment-based config loader

Test data handling (JSON/Excel)

Centralized logging

Reporting

Allure integration

Screenshot embedding on failures

Execution metadata (browser, env, OS)

Parallel & CI Execution

Parallel test execution support

Maven profiles for environments

Jenkins-ready commands

🔸 Sample Deliverables to Generate

Sample feature file

Sample Page Object

Sample Step Definition

Sample Cucumber Runner

Sample Hooks class

Well-documented README.md explaining:

Setup

Execution commands

Parallel runs

Report generation

CI usage

🔸 Code Quality Expectations

SOLID principles

No hard-coded values

High reusability

Clean naming conventions

JavaDoc for core utilities

🔹 Final Output Requirement

Generate:

Full project skeleton

Key class implementations (not stubs)

Maven dependencies

Configuration files

Clear comments explaining architecture decisions