package problem;

public class Pro1 {
	public static void main(String[] args)	{
		int fahrenheit = 100;

		//C= 5/9*(F-32);
		float celcius =
				(float)(((int)((5.0/9.0 *
						(fahrenheit - 32)*100)+0.5))/100.0);


		System.out.println("Fahrenheit: " + fahrenheit);
		System.out.println("Celcius : " + celcius);

		return;
	}
}
