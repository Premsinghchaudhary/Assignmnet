package Function;

import java.util.Scanner;

public class operator {
	public static void main(String args[]) {
		aceept_no(); //calling the accept method 
		
	}
      
	public static void aceept_no(){ //create the new method by using function 
	    int a,b;  //declarred the varaible

	    Scanner sc=new Scanner(System.in); //scanner 
	    System.out.println(" enter the two numbers: ");  //get the number from user 	  
	    a=sc.nextInt();
	    b=sc.nextInt();
	    System.out.println(" a is :"+a);  //print the value of a 
	    System.out.println(" b is :"+b);//print the value of b 
	    athrmetic( a,b);  //use the value of a and b in the 'athrmetic' function
	    logical_opr(a,b); //use the value of a and b in the 'logical_opr' function
	    relation(a,b);//use the value of a and b in the 'relation' function
	
	}
	
	public static void athrmetic( int a,int b){ //creat the new function for arthemetic
		System.out.println( " The athrmrtic opr.: "); 
		System.out.println( " The addition of two no is : "+(a+b)); //The sum(+) of a and b
		System.out.println( " The substraction of two no is : "+(a-b));//the sub (-) of a and b
		System.out.println( " The multiplication of two no is : "+(a*b));//the mul (*) of a and b
		System.out.println( " The division of two no is : "+(a/b));//the division (/) of a and b
		System.out.println( " The modulas  is : "+(a%b));//the modulas (%) of a and b
		
		}
	
	public static void logical_opr(int a,int b) // create function for logical_opr.
	{
	    //AND
		System.out.println(" Te logical opr.");
		System.out.println(" The AND opr. is : "+ ( a>b&&a>b ) );
		System.out.println(" The AND opr. is : "+ ( a>b&&a<b ) );
		System.out.println(" The AND opr. is : "+ ( a<b&&a>b) );
		System.out.println(" The AND opr. is : "+ ( a<b&&a<b) );
		//OR 
		System.out.println(" The OR opr. is : "+ ( a>b||a>b ) );
		System.out.println(" The OR opr. is : "+ ( a>b||a<b ) );
		System.out.println(" The OR opr. is : "+ ( a<b||a>b) );
		System.out.println(" The OR opr. is : "+ ( a<b||a<b) );
		//NOT
		System.out.println(" The ! opr. is : "+ ( a>b|a>b ) );
		System.out.println(" The ! opr. is : "+ ( a>b|a<b ) );
		System.out.println(" The ! opr. is : "+ ( a<b|a>b) );
		System.out.println(" The ! opr. is : "+ ( a<b|a<b) );
	}
	public static void relation(int a,int b) //create function relation
	 {
	   System.out.println( " The relation opr. is; ");//
		if( a>b) { //using condition statement 
			System.out.println( " a is greater than b: "+a);//print the value of a 
		}
		else {
			System.out.println( " b is greater than a: "+b);//print the value of b 
		}
		


			
		}
	}
		