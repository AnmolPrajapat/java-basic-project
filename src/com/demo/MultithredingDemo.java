package com.demo;

class A extends Thread
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
class B extends Thread
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
public class MultithredingDemo
{

	public static void main(String[] args)
	{
		Thread obj1 = new A();
		Thread obj2 = new B();
		obj1.start();
		obj2.start();

	}

}
