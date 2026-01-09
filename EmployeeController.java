package com.demo.EmployeeModularApproach;
import java.util.Scanner;

public class EmployeeController {
    public static void main(String[] args) throws Exception {
        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Welcome to Employee System ---");
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Employee Name: ");
        String name = sc.next();

        // 1. Pack the data into the POJO
        PojoEmployee emp = new PojoEmployee();
        emp.setId(id);
        emp.setName(name);

        // 2. Send it to the Service
        service.saveEmployee(emp);
        
        // 3. Display results
        System.out.println("\nListing all employees in database:");
        service.showAll();
        
        sc.close();
    }
}