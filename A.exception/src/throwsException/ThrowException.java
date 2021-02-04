package throwsException;

public class ThrowException {

	public static void main(String[] args) {
		try {
			methodA();
			methodB();
		} catch (Exception e) {
			System.out.println("Main Exception End!");
		}
	}

	public static void methodA() throws NullPointerException {
		try {
			String data = null;
			System.out.println("methodA");
			System.out.println(data.toString());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
		System.out.println("methodA Exception End!");
	}

	public static void methodB() throws Exception {
		String data = null;
		System.out.println("methodB");
		System.out.println(data.toString());

		System.out.println("methodB Exception End!");
	}
}
