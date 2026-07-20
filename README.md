# Digital Nurture JavaFSE - Cognizant Deepskilling

## Overview

This repository contains Java learning exercises and practice projects developed as part of the Cognizant Deepskilling program. The workspace includes structured hands-on work across core Java, data structures, design patterns, and test automation using JUnit, Mockito, and SLF4J.

## Repository Focus

The current repository is organized into the following major learning areas:

- **Engineering Concepts**
  - Algorithm and Data Structures exercises
  - Design Pattern implementations
  - Practice-oriented Java projects for problem solving

- **JUnit, Mockito and SL4J**
  - JUnit setup and basic assertions
  - Mockito-based mocking exercises
  - Logging and testing practice with SLF4J-related examples

## Tech Stack

- **Language**: Java
- **Build Tools**: Maven
- **Testing Frameworks**: JUnit, Mockito
- **Logging**: SLF4J
- **Version Control**: Git

## Repository Structure

```text
Digital-Nurture-JavaFSE-Cognizant-Deepskilling/
├── README.md
├── Engineering_Concepts/
│   └── Alog_DS/
│       ├── Ecommerce_Platform_Search_Function/
│       ├── Employee_Management_System/
│       ├── Financial_Forecasting/
│       ├── Inventory_Management_System/
│       ├── Library_Management_System/
│       ├── Sorting_Customer_Orders/
│       └── Task_Management_System/
├── Design_Pattern_Principles/
│   ├── Implementing_Builder_Pattern/
│   ├── Implementing_Factory_Method Pattern/
│   └── Singleton_Pattern/
└── JUnit, Mockito and SL4J/
    ├── Setting_up_Junit/
    └── Mockito_Excercise/
```

## Learning Modules Covered

- Core Java programming
- Object-oriented design principles
- Data structures and algorithmic problem solving
- Design pattern implementations
- Unit testing with JUnit
- Mocking and dependency isolation with Mockito
- Logging and diagnostics with SLF4J

## Module-by-Module Breakdown

### 1. Engineering Concepts
This folder contains algorithmic and data-structure practice problems, such as:

- Search and sort implementations
- Employee, inventory, library, and task management systems
- Financial forecasting exercises

### 2. Design Pattern Principles
This section focuses on reusable software design patterns, including:

- Builder pattern
- Factory method pattern
- Singleton pattern

### 3. JUnit, Mockito and SL4J
This folder contains Maven-based Java test exercises and mock-driven learning, including:

- JUnit setup with Maven
- Mockito service mocking examples
- Test execution and validation practices
- Logging and diagnostic examples using SLF4J-related tooling

## How to Use This Repository

1. Open the relevant module folder based on the topic you want to practice.
2. Confirm that Java and Maven are available on your machine.
3. Navigate to the module directory and run Maven commands from there.
4. Review the module-specific source files, tests, and README documents for learning context.

## Common Commands

```bash
java -version
mvn -version
mvn clean test
mvn clean install
```

## Practical Example

To run the JUnit demo module:

```bash
cd "JUnit, Mockito and SL4J\Setting_up_Junit\demo"
mvn clean test
```

To run the Mockito exercise:

```bash
cd "JUnit, Mockito and SL4J\Mockito_Excercise\mockito_demo"
mvn clean test
```

## Getting Started

### Prerequisites

- JDK 17 or newer
- Maven
- Git
- VS Code or any Java IDE

### Run a Maven module

From the module directory, run:

```bash
mvn clean install  
mvn test
```

For example:

```bash
cd "JUnit, Mockito and SL4J\Setting_up_Junit\demo"
mvn test
```

## Notes

This repository is primarily a learning and practice workspace. Several examples are self-contained Maven modules and may be run independently by navigating into the specific project folder.

## License

This project is intended for educational and learning purposes within the Cognizant Deepskilling program.

