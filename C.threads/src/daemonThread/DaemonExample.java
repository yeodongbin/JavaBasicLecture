package daemonThread;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();

		System.out.println(autoSaveThread.isDaemon());

		autoSaveThread.setDaemon(true);
		autoSaveThread.start();

		System.out.println(autoSaveThread.isDaemon());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		System.out.println("메인 스레드 종료");
	}
}
