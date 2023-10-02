//preparedStatement :insert

import java.sql.*;
import java.io.*;
class InputJDBC
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
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter name : ");
			String name = br.readLine();
			
			System.out.println("Enter City : ");
			String city = br.readLine();
			
			//set values
			
			pstmt.setString(1,name);
			pstmt.setString(2,city);
			
			pstmt.executeUpdate();
			System.out.println("Inserted ...");
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
