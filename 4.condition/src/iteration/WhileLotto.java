package iteration;
/*
1. 범위 : 1 - 45중의 난수(0 제외)
2. 서로다른 숫자 3개
결과) 금주의 1등 예상 당첨번호 : 34 5 27
*/

public class WhileLotto {
	public static void main(String[] args) {
		int num1 = (int)(Math.random() * 3) + 1;
		int num2 = (int)(Math.random() * 3) + 1;
		int num3 = (int)(Math.random() * 3) + 1;

		
		while(num1 == num2 || num1 == num3 || num2 == num3) {
			num1 = (int)(Math.random() * 3
			) + 1;
			num2 = (int)(Math.random() * 3) + 1;
			num3 = (int)(Math.random() * 3) + 1;
		}
		

//		while(true) {
//			if(num1 != num2 && num1 != num3 && num2 != num3)
//				break;
//
//			num1 = (int)(Math.random() * 3) + 1;
//			num2 = (int)(Math.random() * 3) + 1;
//			num3 = (int)(Math.random() * 3) + 1;
//		}

		System.out.println(" 금주의 당첨 예상 번호 : " + num1 + "\t" + num2 + "\t" + num3);
	}
}
