package com.demo;
class A1
{
	int count ;
	public synchronized void increment()  // t1 thread is working t2 has to wait for completion
	{
		count ++;
		
	}
}


public class Synchrinzed 
{

	public static void main(String[] args) throws Exception
	{
		A1 ob = new A1();
        
		Thread t1 = new Thread(new Runnable()
				{
			          public void run()
			          {
			        	  for(int i=0;i<1000;i++)
			        	  {
			        		  ob.increment();
			        	  }
			          }
				}
				
				);

		Thread t2 = new Thread(new Runnable()
				{
			          public void run()
			          {
			        	  for(int i=0;i<1000;i++)
			        	  {
			        		  ob.increment();
			        	  }
			          }
				}
				
				);
		
		t1.start();
		t2.start();
		t1.join();
        
		t2.join();
	
		System.out.println("count is"+ ob.count);
	 }
   
}
