/*Write a program to do the following process 
-Number of Duplicate Words in String
-Number of Words in Given String
-Occurrences of Each Character in String
-Remove Duplicate Words from String 
-Count of Vowelspackage 
*/
package Thursday_lab;
import java.util.Scanner;

public class String_condition {
	//varaibles decelartion.........
	int count,i,j,count_wor;
String s1,s2,s3,s4,line,res= "";;
char vowel;
	Scanner sc=new Scanner(System.in);//scanner

public static void main(String[]args){//main method....
	String_condition obj=new String_condition();//create object......

  obj.duplicate_word();
  obj.count_string();
  obj.Character();
  obj.removedupl();
  obj.vowel_count();
}

public void duplicate_word()
{
	
	
	System.out.println("Enter the line");
	line=sc.nextLine();
	line.toLowerCase();
	String words[]=line.split(" ");
	
	System.out.println("Number of Duplicate words in given string:");
	for(i=0;i<words.length;i++)
	{
		count=1;
		for( j=i+1;j<words.length;j++)
		{
			if(words[i].equals(words[j]))
			{
				count++;
				words[j]="0";
			}
		}
		if(count>1 && words[i]!="0")
		{
			System.out.println(words[i]);
		}
		
	}
	
}

public void count_string() { 

System.out.println("\n Enter the line of word");
s1=sc.nextLine();
 count = 1;

for (i = 0; i < s1.length() - 1; i++)
{
    if ((s1.charAt(i) == ' ') && (s1.charAt(i + 1) != ' '))
    {
        count++;
    }
}
System.out.println("Number of words in a string : " + count);
}
public void Character() {


		
		System.out.print("\n Enter the String");
		s2=sc.next();
		for( i = 0; i < s2.length(); i++){  
            System.out.println(s2.charAt(i) + " ");
		}
    }

public void removedupl() {

System.out.print("\n Enter the String : ");
s3=sc.next();

	s3 = s3.toLowerCase();
	 String rem[] = s3.split(" ");    
    
	     
        for(int i = 0; i < rem.length; i++) 
        {    
             count_wor = 1;    
            for(int j = i+1; j < rem.length; j++) 
            {    
                if(rem[i].equals(rem[j])) 
                {    
                	rem[j]="remove";
                  
                }
             
            }
            }
        for(String word: rem) //use for loop.......
        {
			if(word != "remove") //use the condition
			{
				res= res+ word + " ";
			}
		}
        System.out.println("\n  duplicate words: " + res);//display the result

        }
public void vowel_count()
{
	System.out.print("\n Enter the Word : ");
	s4=sc.next();	
	
    s4 = s4.toLowerCase();
    count = 0;

    for ( i = 0; i < s4.length(); i++) {
        // check if char[i] is vowel
        if (s4.charAt(i) == 'a' || s4.charAt(i) == 'e'
            || s4.charAt(i) == 'i'
            || s4.charAt(i) == 'o'
            || s4.charAt(i) == 'u') {
            // count increments if there is vowel in
            // char[i]
            count++;
        }
    }

    // display the number of vowels in string
    System.out.println("Nuumber of vowels in string are: " + count);
}
		}


