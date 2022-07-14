
/*"Multilevel:
WAP to create a class for Fibonacci series, second class Palindrom No , 
Third class use both the class property and display the output
"
*/
package inheritance;
import java.util.Scanner;
public class multi_fib {
	 int i,n=0,n1=1,n2,c=10; //declared the variable
	public void fib() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the   number:");
	    n=sc.nextInt();
	
		System.out.println("It is fibonanic series:");
   	  
   	  
   	  for( i=2;i<c;i++) //using for loop 
       {
   		  n2=n+n1; //sense of human
   		  System.out.println("n2 = "+n2);//print the value of n2  
   		  n=n1;
   		  n1=n2;
   		  }     		
	}

}
