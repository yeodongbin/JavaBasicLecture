package conditionLoopFunction.homework;

public class Homework_Ex1 {

	public static void main(String[] args) {
		int fahrenheit =100;
		float celcius = (float)((5.0/9.0) * (fahrenheit - 32));
		int cle = (int)(celcius * 1000);
		int num1 = cle % 10;
		if (num1>= 5) {
			cle = cle + 10 - num1;
		} else {
			cle = cle - num1;
		}
		celcius = (float)(cle / 1000.0);
//		System.out.println(cle);
		
		System.out.println("Fahrenheit : " + fahrenheit);
		System.out.println("Celcius:" + celcius );
		
		
		System.out.println("round(float a) : " + 
		(Math.round(celcius*100))/100.0);
	}

}
