package Record_data_student;

import java.sql.*;

public class Show_process extends Update_process {
	public void Display() throws Exception{
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
		
				Connection con = DriverManager.getConnection(url,user,pass);
			        PreparedStatement p = null;
			        ResultSet rs = null;
			            String sql = "select * from Record_data";
			            p = con.prepareStatement(sql);
			            rs = p.executeQuery();
			            System.out.println("id\t\tStudent_name\t\tCity\t\tPhone_no");
			 
			            while (rs.next()) {
			 
			                int id = rs.getInt("id");
			                String Student_name = rs.getString("Student_name");
			                String City = rs.getString("City");
			                int phone_no=rs.getInt("phone_no");
			                
							System.out.println(id + "\t\t" + Student_name + "\t\t" + City + "\t\t" +phone_no);
			            }
			        }
			 
		

}
