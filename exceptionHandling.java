package demoClass;

public class exceptionHandling {
	public static void main(String [] args) {
		try {
			int a[] = {1,2,3};
			int b = 2;
			System.out.println(b/0);
			System.out.println(a[6]);
		}
		catch(ArithmeticException a)
		{
			System.out.println("2 cannot be divide by 0");
		
	}
	}
}
	
