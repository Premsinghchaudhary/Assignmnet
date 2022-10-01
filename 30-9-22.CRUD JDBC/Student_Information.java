package Record_data_student;

import java.util.Scanner;


public class Student_Information extends Delete_process {
     char ans;
	Scanner sc =new Scanner(System.in);
	
	public static void main(String args[]) throws Exception{
		Student_Information ob= new Student_Information ();
		ob.accept();
	}
	public void accept() throws Exception {
		System.out.print("*-*-*-*-*-*-*-*-*   STUDENT INFORMATION   *-*-*-*-*-*-*-*-*");
		 do {
				System.out.println("Select :- \n 1: Insert the data of student"
		                    				+ "\n 2: Display the data of student"
						                    + "\n 3: Delete the data of student"
						                    + "\n 4: Update the data of student");
				System.out.print("Select your option :");
				int choise = sc.nextInt();
				
				switch(choise) {
				case 1:	Insert_data();	
				break;
				
				case 2: Display();
				break;
				case 3: delete();
				break;
				case 4: Update(); 
				break;
					
				}
				System.out.println("Do you want to Add more Items :  Y/N");
				 ans = sc.next().charAt(0); 
		 }
				while(ans == 'y'|| ans =='Y');
				System.out.println("All about Student information :) ");
		 }
	
	
	
	
	
}
	

