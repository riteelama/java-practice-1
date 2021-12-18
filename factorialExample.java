package demoClass;

import java.util.Scanner;

class factorial{
	int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
	int result = fact(n-1)*n;
	return result;
	}
}
public class factorialExample {
	
public static void main(String [] args)
{
	Scanner s  = new Scanner(System.in);
	System.out.println("Enter the number to find factorial: ");
	int i = s.nextInt();
	factorial f = new factorial();
	System.out.println("The factorial of "+i+ " is" + f.fact(i));
	s.close();
}
}
