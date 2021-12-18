package demoClass;

class threadExample01 implements Runnable{
	
	public void run(){
		System.out.println("From thread");
		}
	}
public class threadExample{
	public static void main(String [] args)
	{
		threadExample01 te = new threadExample01();
		Thread t = new Thread(te);
		t.start();
		System.out.println("From main");
		
	}
}
