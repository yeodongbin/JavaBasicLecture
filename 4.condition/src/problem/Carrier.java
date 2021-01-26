package problem;

import java.util.Scanner;

public class Carrier {

	public static void main(String[] args) {
		int n = 0; 
		int bongCnt = 0; 
		int num = 1;

		System.out.println("3~5000kg");

		while (num > 0) {
			System.out.println("=== loop count : " + num);
			System.out.print("> ");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			bongCnt = n;

			if (n >= 3 && n <= 5000) {
				for (int x = 0; x < n; x++) {
					for (int y = 0; y < n; y++) {
						if ((3 * x + 5 * y) == n) {
							bongCnt = Math.min(bongCnt, (x + y));
						}
					}
				}
				System.out.println("bongCnt : " + bongCnt);
				num++;				
			} else {
				System.out.println("bongCnt " + bongCnt);
				System.out.println("-1");
				num = 0;
			} // if end

		} // while end
	} // main end
}
