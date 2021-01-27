package problem;

import java.util.Scanner;

public class Sosu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert Number > ");
		int num = sc.nextInt();
		
		//System.out.println(num);
		
		int count = 0;
		for (int i = 2; i < num; i++) {
			//System.out.print(i + " ");
			if (num % i == 0) {
				count++;
			}
		}
				
		if (count == 0) {
			System.out.println(num + " : 소수입니다.");
		} else {
			System.out.println("소수가 아닙니다.");
		}
		
		// 소수와 소수의 갯수
		// 10 2 3 4 5 6 7 8 9 10
		int count2 = 0;
		int sosu_count = 0;
		
		for ( int i = 2; i<num+1 ; i++) {
			count2 = 0;
			for (int j = 2; j< i+1; j++) {
				if (i % j == 0) {
					count2++;
				}
			}
			if (count2 == 1) {
				System.out.print(i + " ");
				sosu_count++;
			}
		}
		System.out.println("\n소수의 갯수 : " + sosu_count);
		
		
		

	}
}
