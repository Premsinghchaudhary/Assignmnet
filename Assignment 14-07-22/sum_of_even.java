//Write a program to accpet the positive numbers  
//from user and display the sum of that numbers using loop.


package loops;

import java.util.Scanner;

public class sum_of_even
  {

	public static void main(String args[]) {
		sum_of_even obj=new sum_of_even();
		obj.Even_sum();
	}
	
	public void Even_sum() 
	{
	      int num ,sum=0,i,res;
		 Scanner sc =new Scanner(System.in);
		 System.out.println(" Enter the Even number: ");
		 num=sc.nextInt();
		
		 if(num%2==0) { 
			do 
			{
				res=num%10;  
				sum=sum+res;  
				num=num/10;       
			}
			while( num>0);
		 
			System.out.println("The sum of even number is = " + sum);
		 }
		 else {
			 System.out.println("please enter the valid number");
		 }
		 
	 }
	
	}
	       
			
		