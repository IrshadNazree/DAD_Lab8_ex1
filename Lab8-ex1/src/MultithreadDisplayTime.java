import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MultithreadDisplayTime extends Thread{
	public void displayTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		for (int i = 0; i < 10; i++) {
			   System.out.println(dtf.format(now));  
		}
	}
	public void run() {
		displayTime();
	}
}
