import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.DriverManager;

public class JDemo {

 public static void main(String[] args) throws Exception

 {

 Class.forName("com.mysql.cj.jdbc.Driver");

 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

 CallableStatement cs=con.prepareCall("call simple(?,?,?)");

 cs.setInt(1, 555);

 cs.setString(2, "dinesh");

 cs.setFloat(3, 28000);
 
 cs.setInt(1, 55);

 cs.setString(2, "ramesh");

 cs.setFloat(3, 29000);

 cs.execute();

 System.out.println("success");

 }

}







