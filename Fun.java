//preparedStatement :insert

import java.sql.*;
class Fun
{
	public static void main(String args[])
	{
		try
		{
			//load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//creating connection
			String url = "jdbc:mysql://localhost:3306/empl";
		    String username = "root";
			String password = "root";
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			//create a query
			String q = "insert into table1(tName,tcity) values (?,?)";
			//get PreparedStatement object
			PreparedStatement pstmt = con.prepareStatement(q);
			
			//set values
			
			pstmt.setString(1,"Akash");
			pstmt.setString(2,"Noida");
			
			pstmt.executeUpdate();
			System.out.println("Inserted ...");
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
