package threadStateControl.yield.problem;

public class ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;

	public void run() {
		int i = 10;
		while (!stop) {
			if (work) {
				System.out.println(i);
				i--;
				work = false;
			} else {
				Thread.yield();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				work = true;
			}
			if (i == 0) {
				stop = true;
			}
		}
		System.out.println("ThreadB 프로그램 종료");
	}
}
