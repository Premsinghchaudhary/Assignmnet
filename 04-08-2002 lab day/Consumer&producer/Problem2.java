package Thursday_lab;

public class Problem2 {//create a class
	//decalred varaibles 
	int materials;
     boolean available = false;
	//synchrinized set method
     public synchronized int get()
     {
           while (available == false)//using while loop.......
           {
                 try//use the try block where exception is show......
                 {
                       wait();
                 }
                 catch (InterruptedException ie)//use catch block to handle the exception.........
                 {
                 }
           }
           available = false;
           notifyAll();
           return materials;
     }
	////synchrinized set method
     public synchronized void put(int value)
     {
           while (available == true)//using while loop.......
           {
                 try//use the try block where exception is show......
                 {
                       wait();
                 }
                 catch (InterruptedException ie)//use catch block to handle the exception.........
                 {
                       ie.printStackTrace();
                 }
           }
           materials = value;
           available = true;
           notifyAll();
     }
}
