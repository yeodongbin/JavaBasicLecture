package map.hashtable;

import java.util.*;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");

		System.out.print("ID, Password를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);

		while (true) {
			String id = sc.nextLine();
			String password = sc.nextLine();

			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("login");
					break;
				} else {
					System.out.println("Password is not same");
				}
			} else {
				System.out.println("no id");
			}
		}
	} // main
}
