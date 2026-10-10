package com.sj.empmanagmentapplication;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();

        while (true) {
            System.out.println("\n**************** Welcome To Employee Management System ****************");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. View All Employees");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice! Please enter a number between 1 and 6.");
                scanner.next(); // Discard invalid non-integer input
                continue;
            }

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Add Employee ---");
                    employeeService.addEmp();
                    break;
                case 2:
                    System.out.println("\n--- View Employee ---");
                    employeeService.viewEmp();
                    break;
                case 3:
                    System.out.println("\n--- Update Employee ---");
                    employeeService.updateEmployee();
                    break;
                case 4:
                    System.out.println("\n--- Delete Employee ---");
                    employeeService.deleteEmp();
                    break;
                case 5:
                    System.out.println("\n--- View All Employees ---");
                    employeeService.viewAllEmps();
                    break;
                case 6:
                    System.out.println("Thank you for using the application!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter a valid choice (1-6).");
                    break;
            }
        }
    }
}