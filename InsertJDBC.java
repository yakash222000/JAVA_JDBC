import java.sql.*;
class InsertJDBC
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
			
			//create query 
			
			String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null ,tCity varchar(400))";
				
			//create a statement:
			
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			
			System.out.println("table created in database ..");
			con.close();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}