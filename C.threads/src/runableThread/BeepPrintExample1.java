package runableThread;


class BeepTask implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("²Î~" + (i + 1));

			try {
				Thread.sleep(500); // 0.5ÃÊ
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

//      run¤Ìable ÀÍ¸í°´Ã¼ ÀÌ¿ë
//		Thread thread2 = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++) {
//					System.out.println("²Î~" + (i + 1));
//
//					try {
//						Thread.sleep(500); // 0.5ÃÊ
//					} catch (Exception e) {
//					}
//				}
//			}
//		});

		for (int i = 0; i < 5; i++) {
			System.out.println("¶ò~" + (i + 1));

			try {
				Thread.sleep(500); // 0.5ÃÊ
			} catch (Exception e) {
			}
		}
	}

}
