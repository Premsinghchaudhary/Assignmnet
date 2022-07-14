//Single:
//WAP to create a class which contain the method Palindrom .
//the second class will use the proerty of first class and display the output."

package inheritance;

import java.util.Scanner;

public class single_inh {
	public void Palindrm () {
		 Scanner sc = new Scanner(System.in); //scanner 
	       
	       int n, r,sum=0,temp;    //declartion the varaiable
	       
	       System.out.println("Please  enter the no : "); //get the input from user 
	       n= sc.nextInt();
	  
	        temp=n;    // in this line temp value is equal to n
	        while(n>0) //using while loop
	        {    
	            r = n%10;  	
	            sum = (sum*10)+r;    
	            n = n/10;    
	        }

	        if(temp==sum) //using conditional statement   
	        System.out.println("It is palindrom number :  "+sum); //print the palindrom number      
	        else    //using else
	        System.out.println(" It is not a palindrom number : ");     //print the not palindrom number  
	        }  
	}


