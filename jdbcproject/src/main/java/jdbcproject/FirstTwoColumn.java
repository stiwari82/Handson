package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class FirstTwoColumn {
	static Statement selectStmt = null;

	public static void main(String[] args) throws Exception {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
		selectStmt = con.createStatement();
		
	    ResultSet rs = selectStmt.executeQuery("Select eno, ename from employ");
	    while(rs.next()) {
	    	System.out.println(rs.getString(1));
	    	System.out.println(rs.getString(2));
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
