package demoClass;

class First{
	public void display(String msg)
	{
		System.out.println("["+msg);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		
		System.out.println("]");
	}
}

class Second extends Thread{
	First f;
	String msg;
	Second(First fp, String str)
	{
		f=fp;
		msg=str;
		start();
	}
	public void run()
	{
		synchronized(f) {
			f.display(msg);
		}
	}
}
public class threadCommunication {
	public static void main(String [] args)
	{
		First fnew = new First();
		Second ss = new Second(fnew,"Hello");
		Second ss1 = new Second(fnew, "Welcome");
		Second ss2 = new Second(fnew, "Programmer");
	}
	
}
