package problem;

import java.util.*;

public class GCD_problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int g = 0;// 최대공약수
		int l = 0;// 최소공배수

		int minValue = (num1 < num2) ? num1 : num2;
		int maxValue = (num1 > num2) ? num1 : num2;
		System.out.println(minValue);

		for (int i = maxValue ; i>0 ; i++ ) {
			if ((i%num1 ==0)&&(i%num2==0)) {
				l = i;
				break;
			}
		}
		
		for (int i = minValue; i > 0; i--) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				g = i;
				break;
			}
		}
		
		System.out.println("최소공배수 : " + l);
		System.out.println("최대공약수 : " + g);

	}
}
