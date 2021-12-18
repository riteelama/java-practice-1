package demoClass;

import java.util.*;

public class listExample {

		public static void main(String [] args)
		{
			List<Integer> country = new ArrayList<>();
			country.add(0,1);
			country.add(1,3);
			country.get(1);
			country.set(0, 10);
			System.out.println(country);
			
		}
}
