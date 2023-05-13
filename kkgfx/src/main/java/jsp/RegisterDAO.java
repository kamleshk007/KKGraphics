package jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
	public static int newregistration (UserDetails u) {
		int status = 0;
				try {
					Connection con = ConnectionProvider.getcon();
					PreparedStatement ps = con.prepareStatement("insert into kkgraphics_login_details values(?,?,?,?,?,?,?)");
					
					ps.setString(1, u.getName());
					ps.setString(2, u.getEmail());
					ps.setString(3, u.getMobile());
					ps.setString(4, u.getCountry());
					ps.setString(5, u.getGender());
					ps.setString(6, u.getPassword());
					ps.setString(7, u.getCpassword());
					
					
					status=ps.executeUpdate();
					
					
				} catch (Exception e) {
					System.out.println("Exception in RegisterDAO"+e);
				}
				return status;
}
}
