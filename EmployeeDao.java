package com.demo.EmployeeModularApproach;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDao {
	private Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","YOUR_PASSWORD");
	}


public int insertEmployee(PojoEmployee emp) throws Exception {
	
Connection con = getConnection();
String sql = "INSERT INTO emp(id,name) VALUES(?,?)";
PreparedStatement ps = con.prepareStatement(sql);

ps.setInt(1,emp.getId());
ps.setString(2,emp.getName() );

int check = ps.executeUpdate();
if(check > 0) {
	System.out.println("data inserted");
}else {
	System.out.println("data is not inserted");
}
ps.close();
con.close();
return check;
}

public void getAllEmployee(PojoEmployee emp) throws Exception {
	Connection con = getConnection();
	String sql = "SELECT * FROM emp";
	PreparedStatement ps = con.prepareStatement(sql);
	ResultSet rs = ps.executeQuery();
	while(rs.next() ) {
		System.out.println(rs.getInt("id") + " " + rs.getString("name"));
		
	}
	rs.close();
	ps.close();
	con.close();
	
}
	public void updateEmployee(PojoEmployee emp) throws Exception {
		Connection con = getConnection();
		String sql = "UPDATE emp SET name = ? WHERE id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1,emp.getName());
		ps.setInt(2, emp.getId());
		int result = ps.executeUpdate();
		 if(result > 0) {
			 System.out.println("Data updated sucessfully");
		 }else {
			 System.out.println("Data is not updated");
		 }
		
		ps.close();
		con.close();
	}
	
	public void deleteEmployee(PojoEmployee emp ) throws Exception {
		Connection con = getConnection();
		String sql = "DELETE FROM emp WHERE id =? ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1,emp.getId() );
		int rows = ps.executeUpdate();
		if(rows == 0) {
			System.out.println("no employee found with id");
		}else {
			System.out.println("data deleted successfully");
		}
		ps.close();
		con.close();
	}

}


