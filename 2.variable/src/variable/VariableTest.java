package variable;

public class VariableTest {

	public static void main(String[] args) {

		boolean flag = true;
		System.out.println("1. >>>>>" + flag);

		flag = false;
		System.out.println("2. >>>>>" + flag);

		char c = '0';
		System.out.println("c =====  " + c + "\t6" + (int) c);

		int age = 20;
		System.out.println("\t\t : " + (age + 5));

		boolean b;

		if (age < 30) {
			b = true;
		} else {
			b = false;
		}

		System.out.println("b ==== " + b);
	}
}
