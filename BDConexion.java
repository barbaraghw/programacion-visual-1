package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BDConexion {
	public static void main (String [] args)
	{
	try
	{
		Connection con = null
		Class.forName("org.postgresql.Driver");
		con = DriverManager.getConnection (
		"jdbc: postgresql: //localhost:5432/productos","postgres","masterkey");
		Statement stmt = con.createStatement ();
		stmt.executeQuery ("select * FROM prod");
		ResultSet rs = stmt.getResultSet ();
		While (rs.next())
		{
			int sl = rs.getInt (1);
			String s = rs.getString (2);
			System.out.println ("-------------------");
			System.out.println(sl+"\t| "+s);
		}
		System.out.println ("------------");
		stmt.close ();
		}
		catch (Exception e)
		{
			e.printStackTrace ();
		}
	}

}
