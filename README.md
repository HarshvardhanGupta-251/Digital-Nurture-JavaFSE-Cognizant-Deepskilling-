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

- **Languages**: Java, PL/SQL
- **Build Tools**: Maven
- **Testing Frameworks**: JUnit, Mockito
- **Logging**: SLF4J
- **Database**: Oracle SQL
- **Version Control**: Git

## Repository Structure

```text
Digital-Nurture-JavaFSE-Cognizant-Deepskilling/
├── README.md
├── .git/
├── .github/
├── .vscode/
├── Engineering_Concepts/
│   ├── Alog_DS/
│   │   ├── Ecommerce_Platform_Search_Function/
│   │   ├── Employee_Management_System/
│   │   ├── Financial_Forecasting/
│   │   ├── Inventory_Management_System/
│   │   ├── Library_Management_System/
│   │   ├── Sorting_Customer_Orders/
│   │   └── Task_Management_System/
│   └── Design_Pattern_Principles/
│       ├── Implementing_Builder_Pattern/
│       ├── Implementing_Factory_Method Pattern/
│       └── Singleton_Pattern/
├── JUnit, Mockito and SL4J/
│   ├── Setting_up_Junit/
│   │   └── demo/
│   └── Mockito_Excercise/
│       └── mockito_demo/
├── PL SQL Programming/
│   ├── 01_DatabaseSetup.sql
│   └── Exercises/
│       ├── Exercise 1 - Control Structures.sql
│       ├── Exercise 2 - Error Handling.sql
│       ├── Exercise 3 - Stored Procedures.sql
│       ├── Exercise 4 - Functions.sql
│       ├── Exercise 5 - Triggers.sql
│       ├── Exercise 6 - Cursors.sql
│       └── Exercise 7 - Packages.sql
└── Spring Core and Maven/
  └── librarymanagement/
    ├── pom.xml
    └── src/
      ├── main/
      └── test/
```

## Learning Modules Covered

- Core Java programming
- Object-oriented design principles
- Data structures and algorithmic problem solving
- Design pattern implementations
- Unit testing with JUnit
- Mocking and dependency isolation with Mockito
- Logging and diagnostics with SLF4J
- PL/SQL database programming
- Oracle database design and optimization
- Stored procedures, functions, triggers, and packages

## Module-by-Module Breakdown

### 1. Engineering Concepts
This folder contains algorithmic and data-structure practice problems, such as:

- Search and sort implementations
- Employee, inventory, library, and task management systems
- Financial forecasting exercises

#### 1.1 Alog_DS (Algorithms & Data Structures)
- **Ecommerce_Platform_Search_Function**: Binary and linear search implementations
- **Employee_Management_System**: Employee data structure and management
- **Financial_Forecasting**: Time series and forecasting algorithms
- **Inventory_Management_System**: Product inventory tracking and management
- **Library_Management_System**: Book catalog and library operations with search
- **Sorting_Customer_Orders**: Bubble sort and quick sort implementations
- **Task_Management_System**: Task scheduling and management using linked lists

#### 1.2 Design Pattern Principles
This section focuses on reusable software design patterns, including:

- **Builder Pattern**: Object construction with fluent interface
- **Factory Method Pattern**: Object creation abstraction with multiple document types (PDF, Word, Excel)
- **Singleton Pattern**: Single instance management with logging example

### 2. JUnit, Mockito and SL4J
This folder contains Maven-based Java test exercises and mock-driven learning, including:

#### 2.1 Setting_up_Junit
- JUnit setup with Maven configuration
- Basic assertions and test structure
- Test execution and validation practices

#### 2.2 Mockito_Excercise
- Mockito service mocking examples
- Mock object creation and verification
- Dependency isolation for unit testing

### 3. PL SQL Programming
This section covers Oracle database programming with PL/SQL, including:

- **01_DatabaseSetup.sql**: Initial database setup and schema creation
- **Exercises**:
  - Exercise 1: Control Structures (IF/ELSE, loops, conditions)
  - Exercise 2: Error Handling (EXCEPTION, error management)
  - Exercise 3: Stored Procedures (CREATE PROCEDURE, parameter passing)
  - Exercise 4: Functions (CREATE FUNCTION, return values)
  - Exercise 5: Triggers (CREATE TRIGGER, event-driven logic)
  - Exercise 6: Cursors (Explicit cursors, cursor operations)
  - Exercise 7: Packages (Package creation, organization)

## How to Use This Repository

1. Open the relevant module folder based on the topic you want to practice.
2. Confirm that Java and Maven are available on your machine.
3. Navigate to the module directory and run Maven commands from there.
4. Review the module-specific source files, tests, and README documents for learning context.

## Common Commands

```bash
# Check versions
java -version
mvn -version

# Maven build and test
mvn compile
mvn clean install
mvn clean test

# SQL execution (requires SQL client)
sqlplus username@database
# or use your preferred SQL IDE
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

mvn test
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

Examples:

```bash
cd "JUnit, Mockito and SL4J\Setting_up_Junit\demo"
mvn test

cd "JUnit, Mockito and SL4J\Mockito_Excercise\mockito_demo"
mvn test

cd "Spring Core and Maven\librarymanagement"
mvn clean install
```

## Notes

This repository is primarily a learning and practice workspace. Several examples are self-contained Maven modules and may be run independently by navigating into the specific project folder.

## License

This project is intended for educational and learning purposes within the Cognizant Deepskilling program.

