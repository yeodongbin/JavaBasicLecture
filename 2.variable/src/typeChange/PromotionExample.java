package typeChange;

public class PromotionExample {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);

		char charValue = 'A';
		intValue = charValue;
		System.out.println("A = " + intValue);

		intValue = 500;
		long longValue = intValue;
		;
		System.out.println(longValue);

		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
	} //main
}
