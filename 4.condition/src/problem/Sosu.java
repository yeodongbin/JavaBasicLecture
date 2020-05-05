package problem;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		for (int i = 1; i <= num; i++) {
			// 약수
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//소수
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			count = 0;
			for (int j = 1; j < i+1; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("sosu : " + i);
			}
		}

	}
}
