package com.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionDemo
{

	public static void main(String[] args)
	{
	 List<Integer> values = new ArrayList<>();
	   values.add(605);
	   values.add(518);
	   values.add(623);
	   values.add(477);
	  
	   /*
	    * Iterator it = values.iterator();
	    
	   while(it.hasNext())
		   {
		   System.out.println(it.next());
		   }
     	*/
	 
	//   Comparator<Integer> c = ( i,  j) -> {return i%10>j%10?1:-1;};
	   
	//   Collections.sort(values,c);
	   Collections.sort(values,( i,  j) -> {return i%10>j%10?1:-1;})   ;
	   
	   for(Integer o: values)
	   {
		   System.out.println(o);
	   }
	   
	}

}
