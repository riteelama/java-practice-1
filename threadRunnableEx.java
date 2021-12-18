package demoClass;

class threadRunnable1 implements Runnable{
	public void run() {
		for(int i=0; i<=5; i++)
		{
			System.out.println("From 1 thread" + i);
		}
	}
	
}

class threadRunnable2 implements Runnable{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("From 2 thread" + i);
		}
	}
}
public class threadRunnableEx {
	public static void main(String [] args)
	{
		threadRunnable1 tr1 = new threadRunnable1();
		Thread t1 = new Thread(tr1);
		threadRunnable2 tr2 = new threadRunnable2();
		Thread t2 = new Thread(tr2);
		
		t1.start();
		t2.start();
	}
}
