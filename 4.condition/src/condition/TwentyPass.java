package conditionLoopFunction;

import java.util.Scanner;

public class TwentyPass {

	public static void main(String[] args) {

		boolean is = true;
		int keycode = 0;
		int me;
		int Q;
		int i = 21;

		Q = (int) (Math.random() * 100) + 1;
		
		while (is) {
			i--;
			if (keycode != 13 && keycode != 10) {
				System.out.println("-----------");
				System.out.println("   스무고개     ");
				System.out.println(" 1~100     ");
				System.out.println("-----------");
				System.out.println("남은질문" + i);
			}

			Scanner sc = new Scanner(System.in);
			me = sc.nextInt();
			
			if (i == 1) {
				System.out.println("코인을 다 쓰셨습니다");
				is = false;
				break;
			}

			if (me > Q) {
				System.out.println("그것보다 적습니다.");
			} else if (me < Q) {
				System.out.println("그것보다 많습니다.");
			} else if (me == Q) {
				System.out.println("축하합니다");
				System.out.println("정답은" + Q + "였습니다.");
				is = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
