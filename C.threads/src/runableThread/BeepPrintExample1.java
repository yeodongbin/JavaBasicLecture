package runableThread;


class BeepTask implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("��~" + (i + 1));

			try {
				Thread.sleep(500); // 0.5��
			} catch (Exception e) {
			}
		}
	}
}

public class BeepPrintExample1 {

	public static void main(String[] args) {

		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();

//      run��able �͸�ü �̿�
//		Thread thread2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("��~" + (i + 1));
//
//					try {
//						Thread.sleep(500); // 0.5��
//					} catch (Exception e) {
//					}
//				}
//			}
//		});

		for (int i = 0; i < 5; i++) {
			System.out.println("��~" + (i + 1));

			try {
				Thread.sleep(500); // 0.5��
			} catch (Exception e) {
			}
		}
	}

}
