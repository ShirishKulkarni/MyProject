


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHelper {

	public static void close(Statement obj)
	{
		try
		{
			if(obj!=null)
				obj.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet obj)
	{
		try
		{
			if(obj!=null)
				obj.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void close(Connection obj)
	{
		try
		{
			if(obj!=null)
				obj.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection()
	{
		Connection con = null;
		
		String url = "jdbc:hsqldb:hsql://localhost/xdb";
		String pwd =  "";
		String uid = "SA";
		
		String sql = null;
		
		try
		{		
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			con = DriverManager.getConnection(url,uid,pwd);
			con.setAutoCommit(true);
			
		}
		catch(Exception e)
		{
			if(con!=null)
				try {
					con.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	
}
