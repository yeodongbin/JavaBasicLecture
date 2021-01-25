package typeChange;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);

		//FromIntToFloat ================================================
		int num1 = 123456780;
		int num2 = 123456780;

		float num3 = num2;
		num2 = (int) num3;

		int result = num1 - num2;
		System.out.println(result);

		//FromIntToDouble ================================================
		double num4 = num2;
		num2 = (int) num4;
		
		int result = num1 - num2;
		System.out.println(result);

		//OperationsPromotionExample ================================================
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2; 
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);


		//================================================
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; 
		int intValue2 = charValue1 + charValue2;
		System.out.println("=" + intValue2);
		System.out.println("=" + (char) intValue2);


		//================================================
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);

		int intValue5 = 10;
		// int intValue6 = 10 / 4.0; //������ ����
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	}
}
