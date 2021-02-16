package runableThread;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread = new NumberThread();
		thread.start();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int alpabet = 65;

		for (int i = 0; i < 26; i++) {
			System.out.println((char) (alpabet + i));
		}
		
		
		
		System.out.println("Program End(Thread-01)");
	}
}

class NumberThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}