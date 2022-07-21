package Encapsulation;

import java.util.Scanner;

public class account_details extends account{//use inherrtiance
	Scanner sc=new Scanner(System.in);//scanner object
	public void aceept_account_details() {//create method
		do{                              //using do while loop for repitation of process
			System.out.println("        Welcome to EM");
			//get the input from user
		System.out.print("Enter your  Bank Account Name:");
		name=sc.next();
		System.out.println("Select Your Account Type \n 1 SAVING ACCOUNT: \n 2 CURRENT ACCOUNT ");
		type=sc.nextInt();
		//using switch case......
		switch(type) {
		 case 1:
			  System.out.println("SAVING ACCOUNT"); 
			  break;
			  case 2:
			  System.out.println("CURRENT ACCOUNT" );
			  break;
		default:
			 System.out.println(" invaild : " );
			  break;
		}
		//get input from user 
		System.out.println("Enter  your Account No:");
		acc=sc.nextLong();
		System.out.print("Enter the Account holder name:");
		user_name=sc.next();
		
		System.out.println("Your Account Balance is:"+getBal());
		System.out.print("Enter Your 4 digits PIN :");
		setPin(sc.nextInt());
		//using condition when user enter the same pin we can process the transaction otherwise can't
		if(getPin()==1234) {
			trans();
			
		}
		else {
			System.out.println("please! Enter the vaild pin");
		}
	//again repeat the process using loop
		System.out.print("\nDo you want to continue (y/n) ? ");
		count = sc.next().charAt(0);
		}
		while(count=='y'||count=='Y' );
}
	public void trans() {//method for withdraw and deposit     
		
		System.out.println("Select \n 1 WITHDRAW:\n 2 DEPOSIT");
		select=sc.nextInt();
		switch(select) //use switch case
		{
		 case 1:
			  System.out.println("WITHDRAW");//this for withdraw 
			  System.out.print("Enter the withdraw amount :");
				w=sc.nextLong();
				if(getBal() < w ) {
					System.out.println("No enough balance");	
				}
				else {
					System.out.println("Remaining balance is :"+(getBal()-w));
				}

			  break;
			  

			  case 2:
			  
				  System.out.println("DEPOSIT" );//this for deposit
				  System.out.print("Enter the deposit amount :");
					d=sc.nextLong();
					
						System.out.println("Your account balance is :"+(getBal()+d));
			  break;
			  
		default:
			 System.out.println(" invaild : " );
			  break;
		}
		
		
		
			
		
	}
}
