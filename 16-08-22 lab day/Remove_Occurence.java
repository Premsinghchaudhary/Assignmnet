/*Write a program to accept a string from the user and accept a character
from the user and remove all occurrences of a given character from input String.
*/
package Thursday_lab;
import java.util.Scanner;
public class Remove_Occurence {
	
	
		Scanner sc = new Scanner(System.in);//scanner
		// varaiables declartion....
		String s1;
		char c;
		int i,j,count;
		public static void main(String... args)//main method
		{
			new Remove_Occurence();//call the construtor......
		}
		
      public void Remove_Occurence()//create construtor...........
		{
    	  //get the input from user......
			System.out.print("Enter a String  : ");
			s1 = sc.nextLine();
			System.out.print("Enter a Character  : ");
			c = sc.next().charAt(0);
			s1 = s1.toLowerCase();
			char[] t = s1.toCharArray();
			for(i=j=0; i<s1.length(); i++)//use loop....
			{
				if(t[i] != c)//use the condition "if".......
				{
					t[j++] = t[i];
				}
				else 
					count++;
			}
			while(count>0)//using while loop........
			{
				t[j++] = '\0';
		        count--;
			}
			System.out.println(t);
			
		}
		
		
		
	}

