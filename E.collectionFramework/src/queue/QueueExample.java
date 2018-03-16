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
				System.out.println(message.to + "에게 메일 발송 완료");
				break;
			case "sendSMS":
				System.out.println(message.to + "에게 문자 발송 완료");
				break;
			default:
				System.out.println("까톡");
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
