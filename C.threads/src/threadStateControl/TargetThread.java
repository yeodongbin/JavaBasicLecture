package threadStateControl;

public class TargetThread extends Thread {
	public void run() {
		for (long i = 0 ; i<1000000000; i++) {} //RUN
		
		try {
			Thread.sleep(1500); //TIMED_WAITING
		} catch (Exception e) {}
		
		for (long i = 0 ; i<1000000000; i++) {} //RUN
	}
}
