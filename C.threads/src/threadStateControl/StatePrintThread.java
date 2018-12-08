package threadStateControl;

public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println(state);
			
			if(state == Thread.State.NEW ) {
				targetThread.start();
			}
		
			if(state == Thread.State.TERMINATED ) {
				break;
			}
			
			try {
				Thread.sleep(50);
			} catch(Exception e) {}
		}
	}

}
