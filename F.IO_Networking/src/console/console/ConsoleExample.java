package console.console;

import java.io.Console;

//이클립스에서 실행하면 System.console() 메소드는 null 을 리턴하기 때문에
//반드리 명령 프롬프트에서 실행해야 한다.

public class ConsoleExample {
	public static void main(String[] args) {
		Console console = System.console();

		System.out.print("아이디: ");
		String id = console.readLine();

		System.out.print("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);

		System.out.println("---------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}
