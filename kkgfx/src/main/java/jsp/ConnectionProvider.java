package jsp;


import java.sql.Connection;
import java.sql.DriverManager;
import static jsp.Provider.*;

public class ConnectionProvider {
	private static Connection con = null;
	static {
		try {
			Class.forName(driver);
			con=DriverManager.getConnection(connection_url, username, password);
			
		} catch (Exception e) {
			System.out.println("Exception in Connection_Provider..."+e);
		}
	}
	
	public static Connection getcon() {
		return con;
	}
}
