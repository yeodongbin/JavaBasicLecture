package problem;

public class Lotto {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 3) + 1;
		int num2 = 0;
		int num3 = 0;
		
		do {
			num2 = (int)(Math.random() * 3) + 1;
		} while(num1 == num2);
		
		do {
			num3 = (int)(Math.random() * 3) + 1;
		} while(num1 == num3 || num2 == num3);
		
		System.out.println(" 금주의 당첨 예상 번호 : " + num1 + "\t" + num2 + "\t" + num3);
	}
}
