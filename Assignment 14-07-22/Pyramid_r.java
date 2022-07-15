//WAP to accept no rows from the user and accordingly display the pyramid.

package loops;
import java.util.Scanner;
public class Pyramid_r{
	public static void main(String args []){
		Pyramid_r obj=new Pyramid_r();
		obj.pyramid();
	}

	public void pyramid() {
		  Scanner sc = new Scanner (System.in);
		  int row,i,j,count=1;
		  System.out.print(" Enter the no of rows: ");
	      row=sc.nextInt();
	          System.out.println("Your Pyramid is complete");  // Printing Pyramid
	          for (i = row; i > 0; i--)
	          {
	              for (j = 1; j <= i*2; j++) // loop for giving column spaces
	              {
	                  System.out.print(" ");
	              }  
	              for (j = 1; j <= count; j++)       // printing j increment value   
	              {
	                  System.out.print(j+" ");
	              }
	              for (j = count-1; j >= 1; j--)  //printing j decrement value
	              {               
	                  System.out.print(j+" ");            
	              }                       
	              System.out.println(); // Line break
	              count++;
	          }

	  	}

	  
	      
	}

