package priorityThread;

class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
		
		
	}

	public void run() {
		for (int i = 0; i < 2000000000; i++) {
		}
		System.out.println(getName());
	}
}

//public static final int MAX_PRIORITY 10
//public static final int MIN_PRIORITY 1
//public static final int NORM_PRIORITY 5


public class PriorityExample {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			Thread thread = new CalcThread("thread" + i);

			if (i != 10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}

	}

}
