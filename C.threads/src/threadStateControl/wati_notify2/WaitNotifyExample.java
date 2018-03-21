package threadStateControl.wati_notify2;

public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();

		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);

		producerThread.start();
		consumerThread.start();
	}
}
