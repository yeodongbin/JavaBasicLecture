package threadStateControl.wait_notify;

public class ThreadA extends Thread {
	private WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			workObject.methodA();
		}
	}
}

