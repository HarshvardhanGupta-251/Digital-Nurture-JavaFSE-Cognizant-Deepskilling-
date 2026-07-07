package Engineering_Concepts.Alog_DS.Employee_Management_System;

public class EmployeeManager {

    Employee employees[] = new Employee[10];
    int size = 0;

    // Add Employee
    void addEmployee(Employee emp) {

        if (size < employees.length) {

            employees[size] = emp;
            size++;

            System.out.println(
                    "Employee Added Successfully");
        }
        else {

            System.out.println("Array is Full");
        }
    }

    // Search Employee
    void searchEmployee(int id) {

        for (int i = 0; i < size; i++) {

            if (employees[i].employeeId == id) {

                System.out.println(
                        "Employee Found:");

                employees[i].display();
                return;
            }
        }

        System.out.println(
                "Employee Not Found");
    }

    // Traverse Employees
    void traverseEmployees() {

        System.out.println(
                "\nEmployee Records:");

        for (int i = 0; i < size; i++) {

            employees[i].display();
        }
    }

    // Delete Employee
    void deleteEmployee(int id) {

        for (int i = 0; i < size; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < size - 1; j++) {

                    employees[j] =
                            employees[j + 1];
                }

                employees[size - 1] = null;
                size--;

                System.out.println(
                        "Employee Deleted");

                return;
            }
        }

        System.out.println(
                "Employee Not Found");
    }

    public static void main(String args[]) {

        EmployeeManager manager =
                new EmployeeManager();

        manager.addEmployee(
                new Employee(
                        101,
                        "Harsh",
                        "Developer",
                        50000));

        manager.addEmployee(
                new Employee(
                        102,
                        "Rahul",
                        "Manager",
                        70000));

        manager.addEmployee(
                new Employee(
                        103,
                        "Priya",
                        "Tester",
                        45000));

        manager.traverseEmployees();

        manager.searchEmployee(102);

        manager.deleteEmployee(102);

        manager.traverseEmployees();
    }
}
