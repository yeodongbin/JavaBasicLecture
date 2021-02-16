package runableThread;

public class RunableThreadExample {

	public static void main(String[] args) {
		Runnable alpabetTask = new AlpabetThread();
		Thread thread = new Thread(alpabetTask);
		thread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		Thread thread2 = new Thread(new AlpabetThread() {
			@Override
			public void run() {
				int alpabet = 97;
				for (int i = 0; i < 26; i++) {
					System.out.println((char) (alpabet + i));
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread2.start();

		System.out.println("Program End~");
	}
}

class AlpabetThread implements Runnable {
	@Override
	public void run() {
		int alpabet = 65;

		for (int i = 0; i < 26; i++) {
			System.out.println((char) (alpabet + i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}