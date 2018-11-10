package threadPool.execute_submit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecuteVsSubmitExample {

	public static void main(String[] args) throws Exception {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		ExecutorService threadPool = new ThreadPoolExecutor(2, 100, 60L, TimeUnit.SECONDS,
				new SynchronousQueue<Runnable>());

		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					// ������ �� ���� �� �۾� ������ �̸� ���
					// ThreadPoolExecutor threadPoolExecutor =
					// (ThreadPoolExecutor) executorService;
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) threadPool;
					int poolSize = threadPoolExecutor.getPoolSize();
					String threadName = Thread.currentThread().getName();
					System.out.println("[�� ������ ����: " + poolSize + "] �۾� ������ �̸�: " + threadName);
					// ���� �߻� ��Ŵ
					int value = Integer.parseInt("��");// ���� �߻�
				}
			};

			// executorService.execute(runnable);//���ϰ��� ���� ����
			executorService.submit(runnable); // ���ϰ��� ����

			Thread.sleep(10);
		}

		// executorService.shutdownNow();
		executorService.shutdown();
	}
}