package com.demo;

import java.util.Scanner;
import sample.*;

public class Demo2 {

	private static Scanner sc;
	public static void main(String[] args) 
	{
		
		Constructor ob = new Constructor("anmol");
		ob.num1=5;
		ob.num2=11;
		
		System.out.println(ob.num1);
		System.out.println(ob.num2);
	
		try
		{ 
			//int a[]= new int[6];
			int a[][]=
				 {
						 {1,88,55},
						 {55,87,66}
				 };
			for(int k[] : a)
			{
				for(int l:k)
				{
					
				System.out.println(" "+ l);
				}
				System.out.print("\n");
			}
			 //a[5]=56;  // only check first error nd then jump to the consecutive catch
			 sc = new Scanner(System.in);
			 System.out.println("enter two number");
			    int i =sc.nextInt();
			    int j= sc.nextInt();
			//int i=20;
			//int j=8;
		    Number k= (i/j);
			System.out.println("output is "+ k);
			System.out.println("its working fine ");
		}
		
		
		
	    /*	catch(ArithmeticException e)
		{
			System.out.println("error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("error");
		} 
		*/
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e) // after java 7
		{
			System.err.println("error");
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			System.out.println("bye");
		}
	}

}
