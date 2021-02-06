package com.demo;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args)
	{
		Set<Integer> s = new HashSet<>();
		System.out.println(s.add(27));
		System.out.println(s.add(23));
        System.out.println(s.add(22));
		s.add(30);
		s.add(23);
		
		for(Integer i : s)  // enhance for loop
		{
			System.out.println(i);
		}

	}

}
