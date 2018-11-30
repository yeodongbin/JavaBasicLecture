package problem;

public class Pro17 {

	static void println(int i) {
		System.out.println(i);
	}

	static void println(boolean i) {
		System.out.println(i);
	}

	static void println(double i) {
		System.out.println(i);
	}

	static void println(String i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		println(10);
		Printer1.println(10);
		Printer1.println(true);
		Printer1.println(5.7);
		Printer1.println("ȫ�浿");
	}
}

class Printer1 {

	static void println(int i) {
		System.out.println(i);
	}

	static void println(boolean i) {
		System.out.println(i);
	}

	static void println(double i) {
		System.out.println(i);
	}

	static void println(String i) {
		System.out.println(i);
	}
}