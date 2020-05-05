package variables;

public class MaxMinValue {

	public static void main(String[] args) {
		byte byteMax = Byte.MAX_VALUE, 
			 byteMin = Byte.MIN_VALUE;
		short shortMAX = Short.MAX_VALUE, 
			  shortMIN = Short.MIN_VALUE;
		int intMAX = Integer.MAX_VALUE, 
			intMIN = Integer.MIN_VALUE;
		long longMAX = Long.MAX_VALUE, 
			 longMIN = Long.MIN_VALUE;
		float floatMAX = Float.MAX_VALUE, 
			  floatMIN = Float.MIN_VALUE;
		double doubleMAX = Double.MAX_VALUE, 
		       doubleMIN = Double.MIN_VALUE;
		
		System.out.println(byteMax + " " + byteMin);
		System.out.println(shortMAX + " " + shortMIN);
		System.out.println(intMAX + " " + intMIN);
		System.out.println(longMAX + " " + longMIN);
		System.out.println(floatMAX + " " + floatMIN);
		System.out.println(doubleMAX + " " + doubleMIN);
		
		

	}

}
