package problem;

public class Pro16 {

	public static void main(String[] args) {
		Printer printer = new Printer();//��üȭ
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("ȫ�浿");

	}
}

class Printer {

	void println(int a) {
		System.out.println(a);
	}

	void println(boolean is) {
		System.out.println(is);
	}

	void println(double a) {
		System.out.println(a);
	}

	void println(String a) {
		System.out.println(a);
	}
}
