
public class MultithreadTimeApp {
	public static void main(String[] args) {
		Thread displayThread1 = new MultithreadDisplayTime();
		Thread displayThread2 = new MultithreadDisplayTime();
		
		displayThread1.start();
		displayThread2.start();
	}
}
