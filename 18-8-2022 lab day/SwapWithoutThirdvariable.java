//Write a program to swap two strings without using third variable
package Thursday_lab;

import java.util.Scanner;

public class SwapWithoutThirdvariable {  
String a,b;
Scanner sc=new Scanner(System.in);
	    public static void main(String args[]) {  //main method....
	    	SwapWithoutThirdvariable  obj=new SwapWithoutThirdvariable ();//create the object ..
	    	obj.swap_process();//call the function...
	    }  
	    public void acept() 
		 {//get the input from user....
			            System.out.print("Enter first string: ");
	             		a = sc.nextLine();
						System.out.print("Enter second string: ");
			            b = sc.nextLine();
		 }	
	    public void swap_process() {
	    	acept();/// do the process of swapaing..........
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After swap: " + a + " " + b); 
	    }
	}  

