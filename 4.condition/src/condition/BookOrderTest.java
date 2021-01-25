package condition;

public class BookOrderTest {
	public static void main(String[] args) {
		int javaPrice = 24000;
		int jqueryPrice = 21000;
		int oraclePrice = 19000;
		int springPrice = 35000;
		int totalPrice = javaPrice + jqueryPrice + oraclePrice + springPrice;
		int dcPrice = (int)(totalPrice * (1- 0.15));

		System.out.println("JAVA : " + javaPrice );
		System.out.println("jQuery : " + jqueryPrice);
		System.out.println("Oracle : " + oraclePrice);
		System.out.println("Spring : " + springPrice);
		System.out.println("------------------------");
		System.out.println("Total : " + totalPrice );
		System.out.println("DC Price: " + dcPrice);
	}
}
