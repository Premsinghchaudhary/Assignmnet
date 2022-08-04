/*
 Q1) Write a program that creates 2 threads - each displaying a message 
 (Pass the message as a parameter to the constructor).  
 The threads should display the messages continuously till the user presses any key.
*/
package Thursday_lab;
public class Continues_Display_thread1 extends Thread{//using inheritance property
   String st; //decleared data type ad varaible.......
    public Continues_Display_thread1 (String s)//create consturtor  
    {
        st=s;  
    }
    public void run()  //create run method .......
    {
        while(true) //using loop......
        {   System.out.println((Thread.currentThread()).getName()+" "+"Message: "+st);
            System.out.println((Thread.currentThread()).getName()+" "+"Priority:  "+(Thread.currentThread()).getPriority());
             
            try//use the try block....
            {
                Thread.sleep(2000);  //using sleep method of Thread ......
            }
            catch(InterruptedException ie)//use catch block to handle the exception.....
            { 
                System.out.println(ie.toString());
            }           
        }
    }
        
        
}


