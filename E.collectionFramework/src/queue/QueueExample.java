package queue;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQ = new LinkedList<Message>();

		messageQ.offer(new Message("sendMail", "hong"));
		messageQ.offer(new Message("sendSMS", "yeo"));

		while (!messageQ.isEmpty()) {
			Message message = messageQ.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "���� ���� �߼� �Ϸ�");
				break;
			case "sendSMS":
				System.out.println(message.to + "���� ���� �߼� �Ϸ�");
				break;
			default:
				System.out.println("����");
			}
		}
		
	}//main
}

class Message {
	public String command;
	public String to;

	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
