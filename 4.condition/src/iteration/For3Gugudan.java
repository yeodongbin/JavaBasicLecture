package iteration;

public class For3Gugudan {

	public static void main(String[] args) {
		/*
		**** 3단 ****
		3 * 1 = 3
		3 * 2 = 6


		3 * 9 = 27
		*/
		int dan = 3;
		System.out.println("\n구구단중 " + dan + "단을 출력하시오.");
		System.out.println("**** " + dan + "단 ****");
		for(int i=1;i<10;i++) {
			System.out.println(dan + " * " + i + " = " + dan * i);
		}

	}

}
