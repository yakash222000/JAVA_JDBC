import java.sql.*;
import java.io.*;

class ImageSave
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
			String q = "insert into images(pic) values(?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			FileInputStream fis = new FileInputStream("mypic.jfif");
			
			pstmt.setBinaryStream(1,fis,fis.available());
			
			pstmt.executeUpdate();
			
			System.out.println("Done ....");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Error ....");
		}
	}
}