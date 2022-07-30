package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class SalaryQuery {
	static Statement selectStmt = null;

	public static void main(String[] args) throws Exception {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
		selectStmt = con.createStatement();
		
	    ResultSet rs = selectStmt.executeQuery("Select eno , ename , salary from employ where salary between 10000 and 20000");
	    while(rs.next()) {
	    	System.out.print(rs.getString(1));
	    	System.out.print(rs.getString(2));
	    	System.out.println(rs.getString(3));
	    }
	}
	
		catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				selectStmt.close();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		

	}

}

