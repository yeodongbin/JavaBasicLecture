package condition;

public class BookOrderTest {
	public static void main(String[] args) {
		int javaPrice = 24000;
		int jqueryPrice = 21000;
		int oraclePrice = 19000;
		int springPrice = 35000;
		int totalPrice = javaPrice + jqueryPrice + oraclePrice + springPrice;
		int dcPrice = (int)(totalPrice * (1- 0.15));

		System.out.println("===== 도서구입목록 =====");
		System.out.println("JAVA : " + javaPrice + "원");
		System.out.println("jQuery : " + jqueryPrice + "원");
		System.out.println("Oracle : " + oraclePrice + "원");
		System.out.println("Spring : " + springPrice + "원");
		System.out.println("------------------------");
		System.out.println("주문 총금액 : " + totalPrice + "원");
		System.out.println("할인 후 결제금액 : " + dcPrice + "원");
	}
}
