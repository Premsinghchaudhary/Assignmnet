package array;
import java.util.Scanner;
public class StudentMarksList
{
    public static void student_grade()
    {
       System.out.println( " Enter the five student details ");
        Scanner sc=new Scanner(System.in);

        //using array for storing value
        int[] rollno=new int[5];
        String[] name=new String[5];
        int[] s1=new int[5];
        int[] s2=new int[5];
        int[] s3=new int[5];
        int[] s4=new int[5];
        int[] s5=new int[5];
        double[] per=new double[5];
        char[] grd=new char[5];

        //using for loop for initializing the values
        for (int i=0;i<5;i++){
            System.out.println("Enter student "+" details");
            System.out.println("Enter roll no:-");
            rollno[i]=sc.nextInt();
            sc.nextLine();

            System.out.println("Enter name:-");
            name[i]=sc.nextLine();

            System.out.print("Enter s1  marks:-");
            s1[i]=sc.nextInt();

            System.out.print("Enter s2 marks:-");
            s2[i]=sc.nextInt();

            System.out.print("Enter s3 marks:-");
            s3[i]=sc.nextInt();

            System.out.print("Enter s4 marks:-");
            s4[i]=sc.nextInt();

            System.out.print("Enter s5 marks:-");
            s5[i]=sc.nextInt();

            //calculate percentage
            per[i]=(((s1[i]+s2[i]+s3[i]+s4[i]+s5[i])*100)/500.0);
            System.out.println("percentage:"+per[i]);

            //find grade
            if(per[i]<40){
                grd[i]='D';
            }
            else if(per[i]<60){
                grd[i]='C';
            }
            else if(per[i]<80){
                grd[i]='B';
            }
            else{
                grd[i]='A';
            }
            System.out.println("grade:"+grd[i]);
            
        }

        System.out.println();
        //write details of total student by using for loop
        for (int i=0;i<5;i++){
            System.out.println(rollno[i]+"\t"+name[i]+"\t"+per[i]+"\t"+grd[i]);
        }

    }
    public static void main (String args[]) {
    	student_grade();
    }
}

   