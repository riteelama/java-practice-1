package demoClass;

import java.util.*;
public class hashMapExample {
	public static void main(String [] args)
	{
		Map<String, Integer> hm = new HashMap<>();
		hm.put("Nepal",1);
		hm.put("USA",2);
		hm.put("UAE", 3);
		hm.put("China",4);
		hm.remove("UAE");
		System.out.println(hm.get("USA"));
		System.out.println(hm);
		
	}
}
