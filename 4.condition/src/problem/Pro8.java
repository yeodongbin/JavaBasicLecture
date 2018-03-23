package problem;

public class Pro8 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		int result = 0;

		int value = 0;

		while (tmp != 0) {
			value=tmp % 10;
			System.out.println(value);
			result = (result *10) + value;
			tmp /= 10;
		}

		System.out.println("result = " + result);
		if (number == result)
			System.out.println("회전수입니다.");
		else
			System.out.println("회전수가 아닙니다.");
	}
}
