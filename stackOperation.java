package demoClass;
import java.util.*;

public class stackOperation {
	public static void main(String [] args)
	{
		Stack<String> fruits = new Stack<String>();
		fruits.push("apple");
		fruits.push("Orange");
		fruits.push("Strawberry");
		fruits.peek();
		fruits.pop();
		fruits.peek();
		fruits.empty();
		fruits.search("Orange");
		System.out.println("Stack element: "+fruits);
		
	}
}
