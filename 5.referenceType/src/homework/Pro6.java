package referenceType.homework;

public class Pro6 {

	public static void main(String[] args) {
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2680;
		int c500;
		int c100;
		int c50;
		int c10;
		
		System.out.println("money=" + money);
		
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"¿ø:" 
		                      + money/coinUnit[i]);
			money = money%coinUnit[i];
		}
	}
}
