package demoClass;

class threadIssue{
	public void show(String msg) {
		System.out.println("["+msg);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	
System.out.println("]");
	}
}
class ThreadClass extends Thread{
	threadIssue ti;
	String message;
	public ThreadClass(threadIssue t, String s) {
		ti = t;
		message = s;
	}
	public void run() {
		synchronized(ti) {
			ti.show(message);
		}
	}
}
public class threadHandling {
	public static void main(String [] args)
	{
		threadIssue ti = new threadIssue();
		ThreadClass t = new ThreadClass(ti,"Hello");
		t.start();
	}
}
