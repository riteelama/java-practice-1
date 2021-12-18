package demoClass;

public class primeNumber {
	public static void main(String [] args)
	{
		int n, m;
		n=3;
		m=n/2;
		int flag = 0;
		if(n==0||n==1)
		{
			System.out.println(n + "  is not a prime number");
		}else {
			for(int i =2; i<=m; i++)
			{
				if(n%i==0)
				{
					System.out.println(n + "  is not a prime number");
					flag =1;
					break;
				}
			}
			if(flag == 0)
			{
				System.out.println(n + "  is a prime number");
			}
			
		}
		
			
	}
}
