package iteration;
/*
1 2 3 4 5 6 7 8 9 10
11 12 13




91 92 93         99 100
*/

public class For2 {
	public static void main(String[] args) {
		int x = 1;
		for(;;) {
			System.out.print(x++);
			if(x % 10 != 1)
				System.out.print("\t");
			else
				System.out.print("\n");

			if(x > 100)
				break;
		}
	}
}
