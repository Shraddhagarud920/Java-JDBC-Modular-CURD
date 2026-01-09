package com.demo.EmployeeModularApproach;

public class EmployeeService {
    
    private EmployeeDao dao = new EmployeeDao();

    public void saveEmployee(PojoEmployee emp) throws Exception {
        // Business Rule: Let's make sure the name isn't too short
        if (emp.getName().length() < 2) {
            System.out.println("Error: Name is too short!");
            return;
        }
        
        // If everything is okay, tell the DAO to insert it
        dao.insertEmployee(emp);
    }
    
    public void showAll() throws Exception {
        dao.getAllEmployee(new PojoEmployee());
    }
}