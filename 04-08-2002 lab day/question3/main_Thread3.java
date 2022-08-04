package Thursday_lab;

public class main_Thread3 {
	public static void main(String[] args)//create main method........
    {
         try//use try block.....
         {
              Fibonacci3 obj1 = new Fibonacci3();//create object of  class Fibonacci3 
              obj1.start();//call the run method...... of class Fibonacci3
              obj1.sleep(4000);//use sleep method of thread.......
              Reverse3 obj2 = new Reverse3();// create object of class Reverse3 
              obj2.start();//call the run method of reverse class......
         }
         catch (Exception e)//use catch block for handle the exception .........
         {
             System.out.println(e); 
        	 
         }
    }
}
