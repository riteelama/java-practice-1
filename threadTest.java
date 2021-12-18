package demoClass;

class threadExample02 extends Thread{
	public void run() {
		System.out.println("From thread");
	}
}
public class threadTest {
	public static void main(String[] args) {
		threadExample02 te = new threadExample02();
		te.start();
		System.out.println("From main CLass");
	}

}
