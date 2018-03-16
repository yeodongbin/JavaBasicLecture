package iteration;
public class ForTest1 {
	public static void main(String[] args) {
		System.out.println("1 - 10까지 출력하시오.");//1 2 3 4 .. 10
		for(int i=1;i<11;i++) {
			System.out.print(i + "\t");
		}
		//System.out.println();
		//System.out.print("\n");
		System.out.println("\n0 - 10까지의 짝수 출력하시오.");//0 2 4 6 8 10
		for(int i=0;i<11;i++) {
			if(i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.print("\n------------------------------\n");
		for(int i=0;i<11;i+=2) {
			System.out.print(i + "\t");
		}
		System.out.println("\n1 - 10까지의 수를 거꾸로 출력하시오.");//10 9 8 7 ... 2 1
		for(int i=10;i>0;i--) {
			System.out.print(i + "\t");
		}


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
