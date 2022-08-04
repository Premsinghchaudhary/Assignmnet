package Thursday_lab;

public class Main_Thread2 {//This is main class 
	
	      public static void main(String[] args)//create main method
	      {
	    	//create object of classes 
	    	    Problem2 c = new Problem2();
	            Producer2 p1 = new Producer2(c, 1);
	            Consumer2 c1 = new Consumer2(c, 1);
	          //call the run methods......
	            p1.start();
	            c1.start();
	      }
	}

	

