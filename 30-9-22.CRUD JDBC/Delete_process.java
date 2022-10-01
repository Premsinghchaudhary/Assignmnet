package Record_data_student;

import java.sql.*;

public class Delete_process  extends Insert_process{

	public void delete() throws Exception
	 {
			
			System.out.println("Enter your Id here : " );
			int id= sc.nextInt();
			
			String query = " delete from Record_data where id=?";
			Connection con = DriverManager.getConnection(url,user,pass);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			int res = ps.executeUpdate();
			System.out.println("Result : "+res);
			ps.close();
			con.close();
	 }
}
