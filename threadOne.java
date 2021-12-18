package demoClass;

class myThread1 extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++) {
		System.out.println("From Thread 1");
		}
	}
}
class myThread2 extends Thread{
	public void run()
	{
		for(int i=0;i<=5;i++) {
			System.out.println("From Thread 2");
		}
	 }
		
	}


public class threadOne {
	public static void main(String [] args)
	{
		myThread1 t1 = new myThread1();
		myThread2 t2 = new myThread2();
		
		t1.start();
		t2.start();
		
		
	}

}
