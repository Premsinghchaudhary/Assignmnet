package Record_data_student;

import java.sql.*;
import java.util.Scanner;

public class Update_process  {
	Scanner sc=new Scanner(System.in);
	Connection con;
	String name,ph,city,query;
	String url = "jdbc:mysql://localhost:3306/STUDENT";
	String user = "root";
	String pass = "root";
	
	
	public void Update() throws Exception {
		//System.out.println("Enter the Id to Update Student Data : ");
				//up = sc.nextInt();
				System.out.println("Press 1 : Update Name  ");
				System.out.println("Press 2 : Update Phone No  ");
				System.out.println("Press 3 : Update City  ");
				System.out.print("\nPlease Enter you Choice : ");
				int ch = sc.nextInt();
				switch(ch)
				{
					case 1:
					name();
					break;
					
					case 2:
						phno();
						break;
						
					case 3:
						city();
						break;
						
				}
					
			}
			public void name() throws Exception
			{
				System.out.print("Enter your Id  : ");
				int id = sc.nextInt();
				System.out.print("Enter Student_name : ");
				String name = sc.next();
				String nqu = "update  Record_data set Student_name=? where id = ?";
				con = DriverManager.getConnection(url,user,pass);
				PreparedStatement ps1 = con.prepareStatement(nqu);
				ps1.setString(1,name);
				ps1.setInt(2,id);
				ps1.executeUpdate();
				System.out.println("Data Updated.. ");
				ps1.close();
				
			}
			
			public void phno() throws Exception
			{
				System.out.print("Enter your Id : ");
				int id = sc.nextInt();
				System.out.print("Enter your Phone No : ");
				String phone_no = sc.next();
				String nqu = "update  Record_data set Phone_no=? where id = ?";
				con = DriverManager.getConnection(url,user,pass);
				PreparedStatement ps1 = con.prepareStatement(nqu);
				ps1.setString(1,phone_no);
				ps1.setInt(2, id);
				ps1.executeUpdate();
				System.out.println("Data Updated.. ");
				ps1.close();
				
			}
			
			public void city() throws Exception
			{
				System.out.print("Enter your Id  : ");
				int id = sc.nextInt();
				System.out.print("Enter your City Name : ");
				String city = sc.next();
				String nqu = "update  Record_data set City=? where id = ?";
				con = DriverManager.getConnection(url,user,pass);
				PreparedStatement ps1 = con.prepareStatement(nqu);
				ps1.setString(1,city);
				ps1.setInt(2,id);
				ps1.executeUpdate();
				System.out.println("Data Updated.. ");
				ps1.close();
	}
}
