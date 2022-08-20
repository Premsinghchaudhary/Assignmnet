//Write a program to accept two strings from the use and check if first contains second
package Thursday_lab;
import java.util.*;
public class check_if_first_string_contains_second
{	
static String s1,s2;//Variable declaration
	static Scanner sc = new Scanner(System.in);//scanner......
		public static boolean is_string_contains(String str1, String str2) {
	    if (s1 == null || s2 == null) {
	      throw new IllegalArgumentException("You can't pass the  null strings as input.");
	    }
	     boolean ans = false;
	     for (int i = 0; i < s2.length() - 1; i++) 
	     {
	       if (s2.charAt(i) == s1.charAt(0))//using condition........
	       {
	         for (int j = 0; j < s1.length(); j++) //use the for loop
	         {
	      if ((i + j) < s2.length() && str1.charAt(j) == s2.charAt(i + j) && j == s1.length() - 1) 
	           {
	             ans = true;
	             break;
	           }
	        }
	      }
	    }
	    return ans;
	  }
	 public static void main(String[] args) {//main method........
	       acept();//call the acept method.........
	    	}
	 public static void acept() 
	 {//get the input from user.........
		            System.out.print("Enter first string: ");
             		s1 = sc.nextLine();
					System.out.print("Enter second string: ");
		            s2 = sc.nextLine();
		            //print the result............
 System.out.println("The second string contains the first one "+is_string_contains(s1, s2));			 
	            }
 }

