//Write a program to reverse each word of the string
package Thursday_lab;
import java.util.Scanner;
public class Resverse_each_word {
//varaible declartion and using string buffer.............
	Scanner sc = new Scanner(System.in);
	StringBuffer s1 = new StringBuffer("");
	StringBuffer s2 = new StringBuffer("");
	
	 public void accept()
	{//get the input from user........ and aslo apply hte append method...............
		System.out.print("Enter a First String : ");
		s1.append(sc.nextLine());
		System.out.print("Enter a Second  String : ");
		s2.append(sc.nextLine());
				
	}
	public void reverse()
	{
		accept();
		//print the string............
		System.out.println("Reverse String  s1 are : "+s1.reverse());
		System.out.println("Reverse String s2 are : "+s2.reverse());
	}

	public static void main(String[] args) {//main method..................	
		Resverse_each_word ob= new Resverse_each_word ();//create the  object........
		ob.reverse();
	}

}
