package subclassThread;

class BeepThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("²Î~" + (i ));

			try {
				Thread.sleep(500); // 0.5ÃÊ
			} catch (Exception e) {
			}
		}
	}
}

public class BeepPrintExample3 {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò~" + (i ));

			try {
				Thread.sleep(500); // 0.5ÃÊ
			} catch (Exception e) {
			}
		}
	}

}
