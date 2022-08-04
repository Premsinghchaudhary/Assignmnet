package Thursday_lab;

public class Reverse3 extends Thread{//use inhertaince
	  public void run()//create run method .......
	     {
	          try//use try block......
	          {
	               System.out.println("Reverse is: ");
	               for (int i=10; i >= 1 ;i-- )//use for loop..........
	               {
	                    System.out.println(i);// for printing...... 
	               }
	           
	          }
	          catch (Exception e)//use catch block...........
	          {
	        	   System.out.println(e);//simply print 
	          }
	     }
}
