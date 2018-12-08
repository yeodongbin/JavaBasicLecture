package threadStateControl.yield.problem;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		int i = 1;
		while (!stop) {
			if (work) {
				System.out.println(" " + i);
				i++;
				work = false;
			} else {
				Thread.yield();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				work = true;
			}
			if (i == 11) {
				stop = true;
			}
		}
		System.out.println("ThreadA 프로그램 종료");
	}
}
