package com.demo;
class A2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
		
	}
}
class B2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
		
   }
}
public class MultiThreading
{

	public static void main(String[] args)
	{
		Runnable obj1 = new A2();
		Runnable obj2 = new B2();
		// make objects of runnable interface into thread to access start method of thread class
		//obj1 is converted into t1 by using thread class
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		t2.start();

	}

}
