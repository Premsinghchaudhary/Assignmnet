package Record_data_student;

import java.sql.*;
import java.util.Scanner;

public class Insert_process extends Show_process{
	Scanner sc=new Scanner(System.in);
	String url = "jdbc:mysql://localhost:3306/STUDENT";
	String user = "root";
	String pass = "root";
	
	public  void Insert_data() throws Exception {
		
		
				
	System.out.println("Enter your Id here : " );
	int id= sc.nextInt();
	
	System.out.println("Enter your Student_name : " );
	String s_name = sc.next();
	
	System.out.println("Enter your City: " );
	String City= sc.next(); 
	
	System.out.println("Enter your phone no:  " );
	int s_phone_no = sc.nextInt();
	
	
	String query = " insert into Record_data values(?,?,?,?)";
	Connection con = DriverManager.getConnection(url,user,pass);
	PreparedStatement ps = con.prepareStatement(query);
	ps.setInt(1, id);
	ps.setString(2,s_name);
	ps.setString(3,City);
	ps.setInt(4, s_phone_no);
	
	
	int res = ps.executeUpdate();
	System.out.println("Result : "+res);
	ps.close();
	con.close();
	}
}
