/*Write a program to create the chained exception where one 
 * exception describes the cause of another exception.*/
package Thursday_lab;

import java.util.Scanner;

public class Chained_Exception {
	int x,y;
	Scanner sc=new Scanner(System.in);
//main method....
	public static void main(String[] args) {
		Chained_Exception  obj=new Chained_Exception ();
        obj.chainexcp();//call the method......
	}
public  void chainexcp() {//create the method.......
//using try catch block.............
	System.out.print("Enter X value : ");
	x = sc.nextInt();							// storing a value
	System.out.print("Enter Y value : ");
	y = sc.nextInt();							// storing  b value
	try {									// try block where ezception is occur ....
		if(y==0)							// if b =0 then throw exception
		{
		    ArithmeticException ae = new ArithmeticException();		// creating a exception
		   			// object of arithmetic exception creaing a another exception
		    ae.initCause(new Throwable());	//using throwable..........
		    throw ae;
		}
		else {//using else statment........
			System.out.println("The Division of two numbers : "+x/y);
		}
				
	}
    catch(ArithmeticException ae)//using catch block.....
    {
        System.out.println(ae);// print the exception
        System.out.println(ae.getCause());// Getting the cause of the exception
    }
}
	}


