//Write a program to check if two strings are created with same character
package Thursday_lab;
import java.util.Scanner;
public class Print_the_same_charater {
	Scanner sc = new Scanner(System.in);//Scanner .........
	//varaible declartion..............
	String str1, str2;
	char[] ch1,ch2;
	int i,j,count;
	void accept()
	{//get the input from user........
		System.out.print("Enter a First String : ");
		str1 = sc.nextLine();
		System.out.print("Enter a Second String : ");
		str2 = sc.nextLine();
	}

	void same_char()
	{//do the process of the same character............
		accept();
		//using replace method and lowercase method..............
		ch1 = str1.replaceAll("\\s+"," ").toLowerCase().toCharArray();
		ch2 = str2.replaceAll("\\s+"," ").toLowerCase().toCharArray();
		//using for loop............
		for(i=0; i<str1.length(); i++)
		{
			for(j=0; j<str2.length(); j++)
			{//using the condition statment.........
				if(ch1[i] == ch2[j] )
				{
					System.out.print(ch2[j]+"");
				}
			}
		}		
	}	public static void main(String[] args){//main method.........
		Print_the_same_charater obj = new Print_the_same_charater();//create the object......
		obj.same_char();
	}

}