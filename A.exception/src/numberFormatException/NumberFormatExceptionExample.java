package numberFormatException;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int value1 = Integer.parseInt(data1);
		//int value2 = Integer.parseInt(data2); //NumberFormatException
		
		int result = value1;//+ value2;
		System.out.println(result);
		
		double value3 = Double.parseDouble(data1);
		//double value4 = Double.parseDouble(data2);
		double result2 = value3;//+ value4;
		System.out.println(result2);
		
	}
}
