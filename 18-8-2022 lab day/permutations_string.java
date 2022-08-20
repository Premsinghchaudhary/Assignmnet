//Write a program to accept string from user and find all permutations of the string
package Thursday_lab;
import java.util.Scanner;
public class permutations_string
{
	//permutation method
	static void permute(String s , String answer)
	{
		if (s.length() == 0)
		{
			System.out.print(answer + " ");
			return;
		}
		
		//do every possible pemutation of gthe string
		for(int i = 0 ;i < s.length(); i++)
		{
			char ch = s.charAt(i);
			String left_substr = s.substring(0, i);
			String right_substr = s.substring(i + 1);
			String rest = left_substr + right_substr;
			permute(rest, answer + ch);
		}
	}

	//main method.........
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		String s1;
		String answer="";

		//taking input from user
		System.out.print("Enter the string : ");
		s1 = sc.next();
		
		System.out.print("All possible strings are : ");
		permute(s1, answer);
	}


}
