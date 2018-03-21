package threadStateControl.join;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); //��ٸ�
		} catch (InterruptedException e) {
		}

		System.out.println("1~100 ��: " + sumThread.getSum());
	}

}
