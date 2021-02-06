package com.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapCollection {

	public static void main(String[] args)
	{
		Map<Integer , String> m = new HashMap<>();
		System.out.println(m.put(1,"Anmol"));
		m.put(2, "Aman");
		m.put(3,"priya");
		
		Set <Integer> keys = m.keySet();
		 
		for(Integer key : keys)
		{
			System.out.println(key + " "+ m.get(key));
		}
		
		//System.out.println(m);
	}

}
