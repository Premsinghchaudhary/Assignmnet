//Write a program to accept string from the user and check it is palindrome 
//or not without using function of string builder and string buffer
package Thursday_lab;
import java.util.Scanner;
public class Check_palindrome_string{
    static String str, rev = "";//variable declartion.....
    static  Scanner sc = new Scanner(System.in);//scanner .........
	public static void main(String args[])//main method......
	   {
		process();//call the function........
	   }
	     public static void process() {
	 //get the input from user.........
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 //do the proceess........
	      int length = str.length();
	 //use for loop......
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 //using condition.........
	      if (str.equals(rev))
	         System.out.println("It is a palindrome");
	      else
	         System.out.println("It is not a palindrome");
	     
	   }
	}

