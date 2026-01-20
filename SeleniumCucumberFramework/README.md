# Enterprise Java Selenium Cucumber Framework

## Overview
This project is a scalable, maintainable Test Automation Framework designed for enterprise applications using **Java**, **Selenium WebDriver**, **Cucumber BDD**, and **TestNG**.

## Tech Stack
- **Language**: Java 17
- **Build Tool**: Maven
- **Web Automation**: Selenium WebDriver 4.x
- **BDD Framework**: Cucumber 7.x
- **Test Runner**: TestNG (Supports Parallel Execution)
- **Reporting**: Allure + Cucumber HTML Reports
- **Logging**: Log4j2

## Features
- **Thread-Safe**: Uses `ThreadLocal<WebDriver>` for parallel execution.
- **Cross-Browser Support**: Configurable for Chrome, Firefox, and Edge.
- **Page Object Model (POM)**: Separation of page locators and actions.
- **Utilities**: Built-in wrappers for Explicit Waits, Element interactions, and Screenshots.
- **Config Management**: Properties file based configuration.
- **CI/CD Ready**: Easy integration with Jenkins/GitHub Actions via Maven.

## Folder Structure
```
src
├── main/java/framework     # Core Framework Components (Driver, Config, Utilities)
└── test/java               # Test Layer (Pages, Steps, Runners, Hooks)
└── test/resources          # Features, Configs, Test Data
```

## Setup & Execution

### Prerequisites
- JDK 17+
- Maven 3.x
- IDE (IntelliJ / Eclipse)

### Run Tests
To run tests using Maven:
```sh
mvn clean test
```

### Run Specific Tag
```sh
mvn clean test -Dcucumber.filter.tags="@smoke"
```

### View Reports
**Cucumber Report**: `reports/cucumber-reports/cucumber-html-report.html`

**Allure Report**:
```sh
mvn allure:serve
```

## Parallel Execution
Test parallelization is handled by TestNG via `CucumberTestRunner` and `testng.xml`.
- Change `data-provider-thread-count="3"` in `testng.xml` to adjust concurrency.

## Best Practices
- **Wait Strategies**: Use `ElementUtils` methods which prefer explicit waits over `Thread.sleep`.
- **Assertions**: Use strict assertions in Step Definitions.
- **Data**: Keep test data in external files (Properties/Excel/JSON).
