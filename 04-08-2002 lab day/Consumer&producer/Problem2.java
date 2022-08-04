package Thursday_lab;

public class Problem2 {//create a class
	  int materials;
     boolean available = false;
     public synchronized int get()
     {
           while (available == false)
           {
                 try
                 {
                       wait();
                 }
                 catch (InterruptedException ie)
                 {
                 }
           }
           available = false;
           notifyAll();
           return materials;
     }
     public synchronized void put(int value)
     {
           while (available == true)
           {
                 try
                 {
                       wait();
                 }
                 catch (InterruptedException ie)
                 {
                       ie.printStackTrace();
                 }
           }
           materials = value;
           available = true;
           notifyAll();
     }
}
