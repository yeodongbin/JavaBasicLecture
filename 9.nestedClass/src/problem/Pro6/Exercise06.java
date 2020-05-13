package problem.Pro6;

public class Exercise06 {

	public static void main(String[] args) {
		Exercise06 ex = new Exercise06();
		ex.startChat("yeo");
	}

	void startChat(final String chatId) {
		final String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				while (true) {
					String inputDate = "æ»≥Á«œººø‰";
					String message = "[" + nickName + "]" + inputDate;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}

}

class Chat {
	Chat() {
		System.out.println("Chat()");
	}

	void start() {
	};

	void sendMessage(String message) {
	};
}
