.

🏗 Project Structure
To follow industry standards, the project is divided into the following layers:

PojoEmployee.java (Model): A Plain Old Java Object (POJO) that encapsulates employee data using private fields, getters, and setters.

EmployeeDao.java (Data Access Object): Manages the connection to MySQL. It contains all the SQL logic for database operations.

EmployeeService.java (Service Layer): Acts as a bridge. This layer is designed to hold business logic and data validation rules.

EmployeeController.java (Controller): The main entry point. It handles user interaction via the console menu.


Tech Stack
Language: Java

Database: MySQL

Connectivity: JDBC (Java Database Connectivity)

Architecture: Modular/Layered Design

)

🚀 How to use it
To run this on your computer, follow these 3 steps:

1. Setup the Database
Open MySQL and run this simple code:

SQL

CREATE DATABASE office;
USE office;
CREATE TABLE emp (
    id INT PRIMARY KEY,
    name VARCHAR(100)
);
2. Change the Password
Open the EmployeeDao.java file and change the password to match your MySQL password:

Java

// Change "YOUR_PASSWORD" to your actual password
return DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","YOUR_PASSWORD");
3. Run the Program
Run the EmployeeController.java file. You will see a menu in your console!
