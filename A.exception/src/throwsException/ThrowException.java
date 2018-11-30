package throwsException;

public class ThrowException {

	public static void main(String[] args) {
		try {
			aMethod(); // Exception РќДо
			bMethod();
		} catch (Exception e) {
			System.out.println("Main : aMethod NullpointerException");
		}
	}

	public static void aMethod() throws NullPointerException, ClassCastException {
		try {
			String data = null;
			System.out.println(data.toString());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		}
	}

	public static void bMethod() throws Exception {
		String data = null;
		System.out.println(data.toString());
	}
}
