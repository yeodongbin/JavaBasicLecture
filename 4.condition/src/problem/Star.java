package problem;

public class Star {

	public static void main(String[] args) {

//		*
//		**
//		***
//		****
//		*****

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 		 *
		 		**
			   ***
			  ****
			 *****		
		*/

		for (int i = 1; i < 6; i++) {
			for (int j = (5 - i); j > 0; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		*
//		**
//		***
//		**
//		*
//		*
//		**
//		***
//		**
//		*

		int cnt = 1;
		int a = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= cnt; j++) {
				System.out.print("*");
			}
			cnt += a;
			if (cnt == 3) {
				a *= -1;
			}
			System.out.println("");
		}

		for (int i = 1; i <= 5; i++) {
			if (i <= 3) {
				for (int j = 0; j < i; j++) {
					System.out.print('*');
				}
				System.out.println();
			} else {
				for (int j = 5; j >= i; j--) {
					System.out.print('*');
				}
				System.out.println();
			}
		}

	}

}
